import { AuthService, LoginResponse, SignUpResponse } from '../../model/auth/AuthService'
import { HttpClient } from './HttpClient'
import { InvalidAuthError } from '../../model/auth/InvalidAuthError'

export class HttpAuthService implements AuthService {
    constructor(private httpClient: HttpClient) {}

    async login(username: string, password: string): Promise<LoginResponse> {
        const response = await this.httpClient.post('/login', { username, password })
        if (response.statusCode != 200) throw new InvalidAuthError(response.data.error)
        return {
            sessionToken: response.data.sessionToken
        }
    }

    async signUp(username: string, password: string): Promise<SignUpResponse> {
        const response = await this.httpClient.post('/users', {username, password})
        if (response.statusCode != 201) throw new InvalidAuthError(response.data.error)
        return {
            sessionToken: response.data.sessionToken
        }

    }
}

export class RepeatedUserError extends Error {
    constructor(message: string) {
        super(message);
    }
}
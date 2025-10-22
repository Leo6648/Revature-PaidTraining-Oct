export interface CustomList<T>{
    add(t: T): void;
    get(i: number): T;
    remove(i: number): T;
    replace(t: T, i: number): void;
    clear(): void;
    length(): number;
}
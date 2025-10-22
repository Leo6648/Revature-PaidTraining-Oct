import type list = require("./list");

export class CustomArrList<T> implements list.CustomList<T>{
    private arr: T[] = [];
    length(): number {
        return this.arr.length;
    }
    add(t: T): void {
        this.arr.push(t);
    }
    get(i: number): T {
    if (i < 0 || i >= this.arr.length) {
        throw new Error("Index out of bounds");
    }
    return this.arr[i]!;
}

    remove(i: number): T {
        if(i<0||i>this.arr.length){
            throw new Error("Index out of bounds");
        }
        return this.arr.splice(i,1)[0]!;
    }
    replace(t: T, i: number): void {
        if(i<0||i>this.arr.length){
            throw new Error("Index out of bounds");
        }
        this.arr[i] = t;
    }
    clear(): void {
        this.arr = [];
    }
}
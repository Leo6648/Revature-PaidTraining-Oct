"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.CustomArrList = void 0;
var CustomArrList = /** @class */ (function () {
    function CustomArrList() {
        this.arr = [];
    }
    CustomArrList.prototype.length = function () {
        return this.arr.length;
    };
    CustomArrList.prototype.add = function (t) {
        this.arr.push(t);
    };
    CustomArrList.prototype.get = function (i) {
        if (i < 0 || i >= this.arr.length) {
            throw new Error("Index out of bounds");
        }
        return this.arr[i];
    };
    CustomArrList.prototype.remove = function (i) {
        if (i < 0 || i > this.arr.length) {
            throw new Error("Index out of bounds");
        }
        return this.arr.splice(i, 1)[0];
    };
    CustomArrList.prototype.replace = function (t, i) {
        if (i < 0 || i > this.arr.length) {
            throw new Error("Index out of bounds");
        }
        this.arr[i] = t;
    };
    CustomArrList.prototype.clear = function () {
        this.arr = [];
    };
    return CustomArrList;
}());
exports.CustomArrList = CustomArrList;

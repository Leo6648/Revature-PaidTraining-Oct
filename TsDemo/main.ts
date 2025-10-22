import { CustomArrList } from "./arrayList";

    const Mylist = new CustomArrList<string>();

    Mylist.add("Hello");
    Mylist.add("World");

    console.log(Mylist);
function __init__() {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
    console.log(IsSorted(arr, 0));
}

function IsSorted(arr, ind) {
    console.log(arr);
    if (ind === arr.length - 1) {
        return true;
    }

    return arr[ind] < arr[ind + 1] && IsSorted(arr, ind + 1);
}

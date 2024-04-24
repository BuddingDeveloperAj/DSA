const arr = [5, 2, 1, 3, 4, 6];

function sort(arr, r, c, flag) {
    if (r === 0) {
        return;
    }

    if (c < r) {
        if (arr[c] > arr[c + 1]) {
            swap(arr, c, c + 1);
        }
        return sort(arr, r, c + 1);
    }

    return sort(arr, r - 1, 0);
}

function swap(arr, from, to) {
    let temp = arr[from];
    arr[from] = arr[to];
    arr[to] = temp;
}

sort(arr, arr.length - 1, 0);

console.log(arr);

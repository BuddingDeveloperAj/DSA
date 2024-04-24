const arr = [5, 2, 3, 1, 4, 6];

function sort(arr, r, c, max) {
    if (r === 0) {
        return;
    }

    if (c < r) {
        if (max > -1) {
            if (arr[c] > arr[max]) {
                max = c;
            }
        } else {
            max = c;
        }
        return sort(arr, r, c + 1, max);
    } else {
        swap(arr, r, max);
        return sort(arr, r - 1, 0, -1);
    }
}

function swap(arr, from, to) {
    let temp = arr[from];
    arr[from] = arr[to];
    arr[to] = temp;
}

sort(arr, arr.length - 1, 0, -1);
console.log(arr);

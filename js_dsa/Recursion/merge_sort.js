const arr = [5, 2, 4, 7, 1, 6, 3, 9, 0];

function merge(arr) {
    if (arr.length === 1) {
        return arr;
    }

    let mid = Math.floor(arr.length / 2);

    let left = merge([...arr.slice(0, mid)]);
    let right = merge([...arr.slice(mid, arr.length)]);

    return mergeSort(left, right);
}

function mergeSort(arr1, arr2) {
    let res = [];
    let i = 0;
    let j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            res.push(arr1[i]);
            i++;
        } else {
            res.push(arr2[j]);
            j++;
        }
    }

    if (i < arr1.length) {
        res.push(...arr1.slice(i, arr1.length));
    }

    if (j < arr2.length) {
        res.push(...arr2.slice(j, arr2.length));
    }

    return res;
}

function mergeInplace(arr, start, end) {
    if (end - start === 0) {
        return;
    }

    let mid = parseInt((start + end) / 2);

    // console.log(mid);

    mergeInplace(arr, start, mid);
    mergeInplace(arr, mid + 1, end);

    mergeSortInPlace(arr, start, mid, end);
}

function mergeSortInPlace(arr, s, m, e) {
    let res = [];
    let i = s;
    let j = m + 1;

    while (i <= m && j <= e) {
        if (arr[i] < arr[j]) {
            res.push(arr[i]);
            i++;
        } else {
            res.push(arr[j]);
            j++;
        }
    }

    // this is new

    if (i <= m) {
        res.push(...arr.slice(i, m + 1));
    }

    if (j <= e) {
        res.push(...arr.slice(j, e + 1));
    }

    console.log(res);

    for (let z = 0; z < res.length; z++) {
        arr[s + z] = res[z];
    }
}

// let res = merge(arr);
// console.log(res);

mergeInplace(arr, 0, arr.length - 1);
console.log(arr);

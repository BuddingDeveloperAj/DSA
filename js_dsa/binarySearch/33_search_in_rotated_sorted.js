var search = function (arr, target) {
    let start = 0
    let end = arr.length - 1

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2)

        if (arr[mid] === target) return mid;

        if (arr[mid] >= arr[0]) {
            if (arr[mid] > target && arr[0] <= target) end = mid - 1;
            else start = mid + 1
        }
        else {
            if (arr[arr.length - 1] >= target && arr[mid] < target) start = mid + 1
            else end = mid - 1
        }
    }
    return -1
};


console.log(search([1, 3, 5], 1))
console.log(search([4, 5, 6, 7, 8, 1, 2, 3], 8))

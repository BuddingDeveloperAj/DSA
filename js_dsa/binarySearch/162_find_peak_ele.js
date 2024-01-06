var link = "https://leetcode.com/problems/find-peak-element/"

/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function (arr) {
    let start = 0;
    let end = arr.length - 1;

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);

        if (end > mid && arr[mid] > arr[mid + 1]) {
            return mid
        }
        else if (start < mid && arr[mid] < arr[mid - 1]) {
            return mid - 1
        }
        else if (arr[mid] < arr[mid + 1]) {
            start = mid + 1
        }
        else end = mid
    }
};

console.log(findPeakElement([6, 5, 4, 3, 2, 3, 2]))
let inputs = [
  { nums: [4, 5, 6, 7, 0, 1, 2], target: 0 },
  { nums: [4, 5, 6, 7, 0, 1, 2], target: 7 },
  { nums: [1], target: 1 },
  { nums: [1, 3], target: 3 },
  { nums: [5, 1, 3], target: 1 },
  { nums: [5, 1, 3], target: 5 },
  { nums: [3, 4, 5, 6, 1, 2], target: 2 },
  { nums: [6, 7, 1, 2, 3, 4, 5], target: 6 },
];

let expected_output = [4, 3, 0, 1, 1, 0, 5, 0];

let testResults = [];

let testingFrom = 0;
let testingEnd = inputs.length;

for (let ind = testingFrom; ind < testingEnd; ind++) {
  let output = programme(inputs[ind]);
  let result;

  if (Array.isArray(expected_output[ind])) {
    result = JSON.stringify(output) === JSON.stringify(expected_output[ind]);
  } else {
    result = output === expected_output[ind];
  }
  testResults.push({
    Input: inputs[ind],
    Output: output,
    Expected: expected_output[ind],
    Passed: result ? "PASSED" : "FAILED",
  });
}

function programme({ nums, target }) {
  function bs(arr, start, end, target) {
    while (start <= end) {
      let mid = Math.floor(start + (end - start) / 2);
      if (arr[mid] === target) {
        return mid;
      }
      if (arr[mid] < target) {
        start = mid + 1;
      } else end = mid - 1;
    }
    return -1;
  }

  function findPivot(arr) {
    if (arr.length > 1 && arr[0] > arr[1]) return 0;

    let start = 0;
    let end = arr.length - 1;

    while (start < end) {
      let mid = Math.floor(start + (end - start) / 2);
      if (arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (arr[mid] < arr[mid - 1]) {
        return mid - 1;
      } else if (arr[start] > arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  let pivot = findPivot(nums);
  let toSearchBefore = pivot === -1 ? false : nums[0] <= target;

  console.log(pivot, toSearchBefore);

  if (toSearchBefore) {
    return bs(nums, 0, pivot, target);
  } else {
    return bs(nums, pivot + 1, nums.length - 1, target);
  }
}

console.table(testResults);

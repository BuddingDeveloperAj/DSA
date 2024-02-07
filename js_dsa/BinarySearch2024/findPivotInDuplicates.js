let inputs = [
  [8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8],
  [2, 5, 6, 0, 0, 1, 2],
];

let expected_output = [-1, 2];

let testResults = [];

let testingFrom = 0;
let testingEnd = 1; //inputs.length;

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

function programme(nums) {
  function findPivot(arr) {
    let s = 0;
    let e = nums.length - 1;

    while (s < e) {
      let mid = Math.floor(s + (e - s) / 2);
      console.log(s, mid, e);

      if (arr[mid] > arr[mid + 1]) return mid;
      else if (arr[mid - 1] > arr[mid]) return mid - 1;
      else if (arr[s] == arr[mid] && arr[mid] == arr[e]) {
        console.log(arr[s], arr[mid], arr[e]);
        if (s < e && arr[s] > arr[s + 1]) {
          return s;
        }
        s++;
        if (e > s && arr[e - 1] > arr[e]) {
          return e;
        }
        e--;
      } else if (
        arr[s] < arr[mid] ||
        (arr[mid] == arr[s] && arr[mid] > arr[e])
      ) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }

    return -1;
  }

  return findPivot(nums);
}

console.table(testResults);

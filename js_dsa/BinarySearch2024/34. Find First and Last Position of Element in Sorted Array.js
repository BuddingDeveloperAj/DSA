let inputs = [
  {
    N: [5, 7, 7, 8, 8, 9, 10],
    T: 8,
  },
  {
    N: [2, 2],
    T: 2,
  },
];

let expected_output = [
  [3, 4],
  [0, 1],
];

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

// function programme({ N, T }) {
//   function elementFinder(arr, s, e, t) {
//     while (s <= e) {
//       let mid = Math.floor(s + (e - s) / 2);
//       if (arr[mid] === t) {
//         return mid;
//       } else if (arr[mid] < t) {
//         s = mid + 1;
//       } else {
//         e = mid - 1;
//       }
//     }
//     return s;
//   }

//   let left = elementFinder(N, 0, N.length - 1, T);
//   if (left >= N.length || N[left] != T) {
//     return [-1, -1];
//   }
//   let right = elementFinder(N, left - 1, N.length - 1, T + 1) - 1;
//   return [left, right];
// }

function programme({ N, T }) {
  function elementFinder(arr, target, s, isStartIndex) {
    let e = arr.length - 1;
    let ans = -1;

    while (s <= e) {
      let mid = Math.floor(s + (e - s) / 2);
      if (arr[mid] < target) {
        s = mid + 1;
      } else if (arr[mid] > target) {
        e = mid - 1;
      } else {
        ans = mid;
        if (isStartIndex) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }
      }
    }
    return ans;
  }

  let left = elementFinder(N, T, 0, true);

  if (left == -1) {
    return [-1, -1];
  }
  let right = elementFinder(N, T, left, false);
  return [left, right];
}

console.table(testResults);

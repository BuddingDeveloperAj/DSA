let inputs = [
  {
    weights: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
    days: 5,
  },
  {
    weights: [3, 2, 2, 4, 1, 4],
    days: 3,
  },
];

let expected_output = [15, 6];

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

function programme({ weights, days }) {
  let start = Math.max(...weights);
  let total_weight = weights.reduce((tot, cur) => (tot += cur), 0);
  let end = total_weight;

  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2);

    let d_count = 1;
    let temp_count = 0;
    for (let w of weights) {
      if (temp_count + w > mid) {
        temp_count = w;
        d_count++;
      } else {
        temp_count += w;
      }
    }

    if (d_count > days) {
      start = mid + 1;
    } else {
      end = mid - 1;
    }
  }
  return start;
}

console.table(testResults);

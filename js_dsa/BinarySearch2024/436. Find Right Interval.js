let inputs = [
  [[1, 2]],
  [
    [3, 4],
    [2, 3],
    [1, 2],
  ],
];

let expected_output = [[-1], [-1, 0, 1]];

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

function programme(intervals) {
  let res = [];
  let arr = intervals.map((x, ind) => ({ val: x[0], index: ind }));
  let si = arr.sort((a, b) => a.val - b.val);
  // console.log(si)

  const custom_fn = (si, inter) => {
    let start = 0;
    let end = si.length - 1;

    while (start <= end) {
      let mid = Math.floor(start + (end - start) / 2);

      if (si[mid].val === inter[1]) {
        return si[mid].index;
      }

      if (si[mid].val > inter[1]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return si[start]?.index ?? -1;
  };

  for (let inter of intervals) {
    res.push(custom_fn(si, inter));
  }
  return res;
}

console.table(testResults);

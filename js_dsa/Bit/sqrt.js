const num = 41;

function sqrt(num, decimal) {
  let start = 2;
  let end = num;

  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2);

    if (mid * mid === num) {
      return mid;
    }

    if (mid * mid > num) {
      end = mid - 1;
    } else {
      start = mid + 1;
    }
  }

  let d = 1;
  while (decimal >= d) {
    let ds = 0;
    let de = 9;

    while (ds < de) {
      let mid = Math.floor(ds + (de - ds) / 2);

      let n = end + mid / Math.pow(10, d);
      if (n * n > num) {
        de = mid - 1;
      } else {
        ds = mid + 1;
      }
    }
    end += de / Math.pow(10, d);
    console.log({ decimal, end, de, d, e: de / Math.pow(10, d) });
    d++;
  }

  return end;
}

console.log(sqrt(num, 2));

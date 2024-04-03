const n = 1;

function isPrime(n) {
  if (n <= 1) {
    return false;
  }
  let c = 2;

  while (c * c <= n) {
    if (n % c == 0) {
      return false;
    }
    c++;
  }

  return true;
}

console.log(isPrime(n));

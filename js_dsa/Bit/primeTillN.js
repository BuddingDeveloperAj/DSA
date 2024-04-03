const n = 50;

let arr = Array(n + 1).fill(false);

for (let i = 2; i * i <= n; i++) {
  if (!arr[i]) {
    for (let j = i * 2; j <= n; j += i) {
      arr[j] = true;
    }
  }
}

for (let i = 2; i <= n; i++) {
  if (!arr[i]) {
    console.log(i);
  }
}

var exist = function (board, word) {
  if (board.length * board[0].length < word.length) {
    return false;
  }
  let ROW = board.length - 1;
  let COL = board[0].length - 1;

  function letter_checker(index, word, cp, path) {
    if (index === word.length) {
      return true;
    }

    let [r, c] = cp;

    if (
      r < 0 ||
      r > ROW ||
      c < 0 ||
      c > COL ||
      path.some((e) => e.toString() === [r, c].toString()) ||
      board[r][c] !== word[index]
    ) {
      return false;
    }

    console.log({
      index,
      word,
      cp,
      path,
      str: word[index],
      board,
    });

    path.push([r, c]);

    let new_possiblities = [
      [r, c + 1],
      [r, c - 1],
      [r - 1, c],
      [r + 1, c],
    ];

    for (let i of new_possiblities) {
      res = letter_checker(index + 1, word, i, path);

      if (res) {
        return true;
      }
    }
    path.pop();
    return false;
  }

  for (let r = 0; r <= ROW; r++) {
    for (let c = 0; c <= COL; c++) {
      res = letter_checker(0, word, [r, c], []);
      if (res) {
        return true;
      }
    }
  }
  return false;
};

let board = [
  ["A", "A", "A", "A", "A", "A"],
  ["A", "A", "A", "A", "A", "A"],
  ["A", "A", "A", "A", "A", "A"],
  ["A", "A", "A", "A", "A", "A"],
  ["A", "A", "A", "A", "A", "A"],
  ["A", "A", "A", "A", "A", "A"],
];
let word = "AAAAAAAAAAAAAAB";
console.log(exist(board, word));

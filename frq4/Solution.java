public int getPointsForRow(int targetRow) {
  int sum = 0;
  int i = 0;
  int count = 0;
  for (int j = 0; j < board.length; j++) {
    sum += board[targetRow][j].getPoints();
  }
  while (board[targetRow][i].getColor().equals(board[targetRow][i+1].getColor())) {
    count++;
    i++;
  }
  if (count == board.length) {
    return 2*sum;
  } else {
    return sum;
  }
}

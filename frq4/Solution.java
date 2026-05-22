public int getPointsForRow(int targetRow) {
  int sum = 0;
  int i = 0;
  int count = 0;
  for (int i = 0; i < space.length; i++) {
    sum += space[targetRow][i];
  }
  while (space[targetRow][i].getColor().equals(space[targetRow][i+1].getColor())) {
    count++;
  }
  if (count == space.length) {
    return 2*sum;
  } else {
    return sum;
  }
}

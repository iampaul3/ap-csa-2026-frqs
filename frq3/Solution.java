public int moreHistoryThanMathAbsences() {
  int counter = 0;
  for (int i = 0; i < historyList.size(); i++) {
    for (int j = 0; i < mathList.size(); j++) {
      if (historyList.get(i).getStudentID() == mathList.get(j).getStudentID()) {
        if (historyList.get(i).getAbsences() > mathList.get(j).getAbsences()) {
          counter++;
        }
      }
    }
  }
  return counter;
}

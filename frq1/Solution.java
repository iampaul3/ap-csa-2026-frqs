# Part A
public Account(String requestedName) {
  username = requestedName;
  int i = 0;
  while (!isAvailable(requestedName)) {
    i++;
    username = requestedName += i;
  }
}

# Part B
public String getShortenedName() {
  String newResult = "";
  int i = 0;
  if (username.indexOf("-") == -1) {
      return username;
  } else {
    while (username.indexOf("-") > 0) {
      int index = username.indexOf("-");
      newResult += username.substring(i, index-1);
      i = index+1;
    }
    return newResult;
  }

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
  if (username.indexOf("-") == -1) {
      return username;
  } else {
    for (int i 
  }

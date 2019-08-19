ArrayList<String> cleanCopyArrayList(  ArrayList<String> list) {

  ArrayList<String> clean = new ArrayList<String>();

  for (int i = 0; i < list.size(); i++) {
    clean.add(list.get(i));
  }

  return clean; 

// end of the cleanCopyArrayList method
}

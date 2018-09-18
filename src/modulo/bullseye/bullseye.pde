void setup() {
  size(600, 600);
}
void draw() {
  noFill();
  for (int j = 505; j > 0; j = j - 55) {
    if(j % 2 == 0){fill(0,0,0);}
    else {fill(255, 0, 0);}
    ellipse(300, 300, j, j);
  }
}

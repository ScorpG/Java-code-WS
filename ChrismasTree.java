public class ChrismasTree {

public static void main(String[] args) {
// initial donut position
int x = 0;
int y = 0;
while (true) {
  // clear screen
  System.out.print("\033[H\033[2J");
  System.out.flush();

  // draw donut
  for (int i = 0; i < y; i++) {
    System.out.println();
  }
  for (int i = 0; i < x; i++) {
    System.out.print(" ");
  }
  System.out.println(" __");
  for (int i = 0; i < x; i++) {
    System.out.print(" ");
  }
  System.out.println("/00\\");
  System.out.println("\00/");
  for (int i = 0; i < x; i++) {
    System.out.print(" ");
    
  }

  System.out.println("\\__/");

  // move donut
  x++;
  if (x > 20) {
    x = 0;
    y++;
  }
  if (y > 20) {
    y = 0;
  }

  // pause
  try {
    Thread.sleep(100);
  } catch (InterruptedException e) {
    // do nothing
  }
}
}}

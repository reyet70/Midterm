//// Midterm code for 59CST112

int m=0;
    // ADD YOUR OWN DECLARATIONS HERE. ++++


//// SETUP:  size and table
void setup() {
    size( 820, 600 );          //++++ CHANGE THE SIZE -- see instructions! ++++
  
    //// MODIFY THIS CODE TO MAKE TABLE CENTERED IN WINDOW.  ++++

 }


//// NEXT FRAME:  table, bounce off walls, collisions, show all
void draw() {
  help();
}


//// HANDLERS:  keys, click
void keyPressed() {
  if (key == 'q') { exit();  }
    //++++ ADD YOUR OWN CODE HERE. ++++
}
//+++++++++++++++++  ALL CODE BELOW THIS LINE SHOULD BE REMOVED ++++++++++++++++++++++//


int mx=0;

void say(String s){  text(s,10,22*m++); }



void help() { background( 255,255,255 ); m=1;
  textSize(20);
  fill(0);
  say( "                   I N S T R U C T I O N S" );
  say("");
  say( "All specifications for project 2 shall apply to this MIDTERM ''M1''." );
  say( "Display three different-colored balls, each with a number" );
  say( "Move the balls (as in project 2) and handle all (elastic) collisions between them.");
  say( "Good coding standards also apply - especially READABILITY & MODULARIZATION." );
  say("");
  say( "Change size of window to 640 x 480, and make sure table is centered." );
  say( "(Your code must work properly for any reasonable window size.)" );
  say( "Change variable names to three words that start with your initials.");
  say("");
  say( "Add a WALL (in the middle) that makes balls remain on right side of table." );
  say( "Keys 1, 2, and 3 reset one ball to right half of table (random X,Y,DX,DY)." );
  say( "Add BUTTONS to do the following:" );
  say( "   1. Reset all balls to the right side of table.   ['r']" );
  say( "   2. Remove the wall; allow balls to move all over table!  ['w']" );
  say( "   3. Change table color to pink.  ['p']" );
  say( "   4. Animated mouse runs across bottom wall of table, with legs moving.  ['m']" );
  say("");
  say( "M2 TAKEHOME EXAM (and optionally for extra credit on M1):" );
  say( "   5. Change window size to 700x500; table centered; code works properly." );
  say( "   6. Click on any ball to move it to right half of table.   (same as keys 1,2,3.)" );
  say("");
  say( "M3 IN-CLASS EXAM (next week) will include:" );
  say( "   7. Write a Ball class (that behaves similarly)." );  
  say( "   8. Write a Bird class, that draws an animated bird with flapping wings.  ['b']" );  
}




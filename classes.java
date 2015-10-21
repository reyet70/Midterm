//////// OO version of Balls and Birds

Ball a,b,c;
Bird p,q,r;

void setup() {
  size(750, 500 );
  a=  new Ball();
  a.dx=3;
  a.dy=2;
  //
  p=  new Bird();
  p.dx=5;
  p.y=  50;
}

void draw() {
  //// Show ball
  a.show();
  a.move();
  //// Show bird
  p.show();
  p.move();
}





//// For object-oriented programming, you will need class definitions like these ////

class Ball {
  //// PROPERTIES:  position, speed, color, etc. ////   (What a Ball "has".)
  float x,y, dx,dy;
  int r,g,b;
  int number;
  
  //// CONSTRUCTORS (if any). ////
  
  //// METHODS:  show, move, detect a "hit", etc. ////  (What a Ball "does".)
  void show() {
    fill(r,g,b);
    ellipse( x,y, 30,30 );
  }
  void move() {
    x=  x+dx;
    y=  y+dy;
  }
  // Detect if this Ball has hit abother Ball. 
  boolean hit( Ball other ) {
    if ( dist( this.x,this.y, other.x,other.y ) < 60 ) return true;
    else return false;
  }
}

class Bird {
  //// PROPERTIES:  position, speed, color, etc. ////   (What a Bird "has".)
  float x,y, dx,dy;
  int r,g,b;
  int number;
  boolean wingUp=false;
  
  //// CONSTRUCTORS (if any). ////
  
  //// METHODS:  show, move, detect a "hit", etc. ////  (What a Ball "does".)
  void show() {
    fill(r,g,b);
    triangle( x,y, x-60,y-20, x-60,y+20 );
    if (wingUp) {
      triangle( x-20,y, x-40,y-50, x-40,y+50 );
    }
  }
  void move() {
    x=  x+dx;
    y=  y+dy;
  }
}
  
  
  

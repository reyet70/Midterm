///// Demo of elastic collisions

float redX=100,redY=100, redDX=4,redDY=2;
float bluX=300,bluY=100, bluDX=-4, bluDY=2;

//// SETUP
void setup() {
  size( 600,400 );
  reset();
}
void reset() {
  redX=100;  redY=100;  redDX=4;  redDY=4;
  bluX=400;  bluY=400;  bluDX=-4;  bluDY=-4;
}

//// NEXT FRAME:
void draw() {
  background( 255,255,200 );
  action();
  camera();
}

void action() {  
  redX=  redX + redDX;
  redY=  redY + redDY;
  //
  bluX=  bluX + bluDX;
  bluY=  bluY + bluDY;
  if (redX<0) reset();
  
  //
  if (dist( redX,redY, bluX,bluY )<30 ){
    //swap dx,dy
    background(0);
    
    //// SAWP DX & DY for both balls.
    float tmp;
    tmp=  redDX;  redDX=  bluDX;  bluDX=  tmp;
    tmp=  redDY;  redDY=  bluDY;  bluDY=  tmp;
    
  }
    
}
void camera() {
  fill(255,0,0);
  ellipse( redX,redY, 30,30 );
  fill(0,0,255);
  ellipse( bluX,bluY, 30,30 );
}


void keyPressed() {
//--  background(255);
  if (key == 'r') reset();
}

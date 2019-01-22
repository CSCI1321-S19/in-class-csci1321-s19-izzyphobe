

package basics

class entity(private var x:Double, private var y:Double)//pass in location - because it changes per entity. 
//if character fires bullet,it should originate where the player is, so we pass in these values
{
  private val width=1.0
  private val height=1.0
  
  def intersects(e:entity):Boolean={
    val overlapx=(x-e.x).abs<(width+e.width)/2
    val overlapy=(y-e.y).abs<(width+e.width)/2
    overlapx&&overlapy //true if overlaps in x and y
  }  

}

object entity{
  def main(args:Array[String]):Unit={
    val e1=new entity(0,0) //create new entity of class "entity"
    val e2=new entity(0,0)//another one yo
    println(e1.intersects(e2)) //returns true - both at 0,0 size 1,1    
    val e3=new entity(3,3)
    println(e1.intersects(e3))//returns false - e3 is at 3,3, e1 is at 0,0

  }
  
}
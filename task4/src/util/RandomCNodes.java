package util;

import cnode.CNode;


import java.util.Random;

import javafx.scene.paint.Color;

public class RandomCNodes {

  public RandomCNodes() {

  }

  public static CNode[] randomCNodes(int n) {
    CNode[] arr = new CNode[n];
    Random r = new Random();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new CNode(1 + r.nextInt(arr.length));//задается value
      arr[i].setX(i * 20);
      arr[i].setFill(Color.CRIMSON);
      setCNodeDim(arr[i]);
    }
    return arr;
 
  }

  private static void setCNodeDim(CNode cnode) {
    cnode.setWidth(10);
    cnode.setHeight((10) * cnode.getValue());//длина по значению
  }
}

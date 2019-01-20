package ClassLectureProblems;

//PROBLEM DOMAIN
//given a tree determine if it is binary search tree
//every number in the tree will be unique
//all numbers are positive ints? - student didn't ask about number type or values
//did student clarify method takes in a tree? not a node?

//example input
//                 10
///              /    \
//              5      20
//             / \     / \
//            4   6   15  31
//                     \
//                      8

//example output false

//PSEUDOCODE
//assuming node passed in is the root of the tree
//ALGORITHM -> isItBinarySearchTree(Node node)
//DECLARE boolean answer = false
//EdgeCase if node is null return answer
//EdgeCase node has no children; answer = true; return answer
//DECLARE Node current = node

//PRIVATE RECURSIVE METHOD
//WHILE current != null
    // if current.left != null
          // if current.left.value < current.right.value
              // answer = true
              // current = current.left

  // if current.left = null && current.right = null
      //return answer
  //else return answer

//LECTURE REVIEW WITH MICHELLE Ferreirae

//if tree null return true;
//else
// tree.getMax(tree.left) < tree.value &&
// tree.getMin(tree.right)> tree.value &&
//isBST(tree.left) &&
//isBST(tree.right)
//return true

///define getMax (get max int)
//define getMin (get min int)

//getMax
//if t null
// return integer min_int
//else return math.max (t.value, max)

//OPTION2 - INORDER
//[1,5,6,10,12,15,18]

//CHECKOUT LeetCode is Balanced


public class BinaryTreeValidation {
}

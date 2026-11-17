class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int astroid:asteroids){
            boolean explode=false;
            while(!stack.isEmpty() && astroid<0 && stack.peek()>0){
                if(stack.peek()<-astroid){
                    stack.pop();

                }
                else if(stack.peek()==-astroid){
                    stack.pop();
                    explode=true;
                    break;
                }
                else{
                    explode=true;
                    break;
                }
            }
            if(!explode){
                stack.push(astroid);
            }
        }
        int[] result= new int[stack.size()];
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
    }
}
package arvore;

public class Tree {
    Node root = null;

   public void insert (int info, Node node){
    if (node == null){
        root = new Node(info);
        return;
    }
    if (node. info > info) {
        //inserir a esq
        if (node. esq == null){
            node.esq = new Node (info);
            return;
        }
        //func. recursiva
        insert(info, node.esq);
    }else{
        //inserir a dir
        if (node.dir == null){
            node.dir = new Node (info);
            return;
        }

        insert(info, node.dir);
    }
    }
   public void search (){}

   public void pre_order (Node node){
    if (node == null){
        System.out.println("Árvore vazia!");
        return;
    }

    System.out.println(node.info);

    if(node.esq != null){
        pre_order(node.esq);
    }

    if(node.dir != null){
        pre_order(node.dir);
    }
    }
   public void in_order (Node node){
    if (node == null){
        System.out.println("Árvore vazia!");
        return;
    }

    if(node.esq != null){

    }
   }

   public void post_order (Node node){
    
    if (node == null){
        System.out.println("Árvore vazia!");
        return;
    }
   }
   
}

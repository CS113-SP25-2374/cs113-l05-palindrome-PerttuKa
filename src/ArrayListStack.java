public class ArrayListStack<E> implements StackInterface{
    E[] array = (E[]) new Object[10];
    int size = 0;

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public Object peek() {
        return array[size-1];
    }

    @Override
    public Object pop() {
        E temp = array[--size];
        array[size] = null;
        return temp;
    }

    @Override
    public Object push(Object obj) {
        array[size++] = (E)obj;
        return obj;
    }
}

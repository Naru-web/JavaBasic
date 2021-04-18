package linkedList_Term;

import linkedList.MySingLinkedList;
import linkedList.Node;

public class Polynomial {

    public char name;
    public MySingLinkedList<Term> terms;

    public Polynomial(char name) {
        this.name = name;
        terms = new MySingLinkedList<Term>();
    }

    public void addTerm(int coef, int expo) {
        if (coef == 0) {
            return;
        }
        // 동일 차수의 항이 있는 경우
        Node<Term> p = terms.head, q = null;
        while (p != null && p.data.expo > expo) {
            q = p;
            p = p.next;

        }
        // 차수가 동일한경우
        if (p != null && p.data.expo == expo) {
            p.data.coef += coef;
            if (p.data.coef == 0) {
                if (q == null) {
                    terms.removeFirst();
                } else {
                    terms.removeAfter(q);
                }
            }

        } else { // add after q
            Term t = new Term(coef, expo);
            if (q == null) {
                terms.addFirst(t);
            } else
                terms.addAfter(q, t);
        }
    }

    public int calc(int x) {
        int result = 0;

        Node<Term> p = terms.head;
        while (p != null) {
            result += p.data.calc(x);
            p = p.next;
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name + "(x)=");
        Node<Term> p = terms.head;
        while (p != null) {
            sb.append("+" + p.data.toString());
            p = p.next;
        }
        return sb.toString(); // sb에 append했던걸 투스트링으로 호출
    }

}

// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import pers.xia.jpython.parser.PythonNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class Starred extends exprType {
    public exprType value;
    public int ctx;

    public Starred(exprType value, int ctx) {
        this.value = value;
        this.ctx = ctx;
    }

    public Starred(exprType value, int ctx, PythonNode parent) {
        this(value, ctx);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        return "Starred";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitStarred(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
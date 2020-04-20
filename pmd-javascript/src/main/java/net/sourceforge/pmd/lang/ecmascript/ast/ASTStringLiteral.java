/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.ecmascript.ast;

import org.mozilla.javascript.ast.StringLiteral;

public class ASTStringLiteral extends AbstractEcmascriptNode<StringLiteral> {
    ASTStringLiteral(StringLiteral stringLiteral) {
        super(stringLiteral);
        super.setImage(stringLiteral.getValue());
    }

    @Override
    public Object jjtAccept(EcmascriptParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public char getQuoteCharacter() {
        return node.getQuoteCharacter();
    }

    public boolean isSingleQuoted() {
        return '\'' == getQuoteCharacter();
    }

    public boolean isDoubleQuoted() {
        return '"' == getQuoteCharacter();
    }
}

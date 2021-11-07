/*
 * generated by Xtext 2.25.0
 */
grammar InternalSQL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.s2c.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.s2c.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.s2c.services.SQLGrammarAccess;

}

@parser::members {

 	private SQLGrammarAccess grammarAccess;

    public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SQLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getStatementsSelectParserRuleCall_0());
			}
			lv_statements_0_0=ruleselect
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"org.xtext.example.s2c.SQL.select");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleselect
entryRuleselect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleselect=ruleselect
	{ $current=$iv_ruleselect.current; }
	EOF;

// Rule select
ruleselect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SELECT'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_1_0());
				}
				lv_expressions_1_0=ruleexpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_1_0,
						"org.xtext.example.s2c.SQL.expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_2_1_0());
					}
					lv_expressions_3_0=ruleexpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_3_0,
							"org.xtext.example.s2c.SQL.expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getFrom_sectionFromSectionParserRuleCall_3_0());
				}
				lv_from_section_4_0=rulefromSection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"from_section",
						lv_from_section_4_0,
						"org.xtext.example.s2c.SQL.fromSection");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getWhere_sectionWhere_clauseParserRuleCall_4_0());
				}
				lv_where_section_5_0=rulewhere_clause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"where_section",
						lv_where_section_5_0,
						"org.xtext.example.s2c.SQL.where_clause");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getGroup_sectionGroup_clauseParserRuleCall_5_0());
				}
				lv_group_section_6_0=rulegroup_clause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"group_section",
						lv_group_section_6_0,
						"org.xtext.example.s2c.SQL.group_clause");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectAccess().getHaving_sectionHaving_clauseParserRuleCall_6_0());
				}
				lv_having_section_7_0=rulehaving_clause
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectRule());
					}
					set(
						$current,
						"having_section",
						lv_having_section_7_0,
						"org.xtext.example.s2c.SQL.having_clause");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRulefromSection
entryRulefromSection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromSectionRule()); }
	iv_rulefromSection=rulefromSection
	{ $current=$iv_rulefromSection.current; }
	EOF;

// Rule fromSection
rulefromSection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FROM'
		{
			newLeafNode(otherlv_0, grammarAccess.getFromSectionAccess().getFROMKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFromSectionAccess().getFrom_itemFromItemParserRuleCall_1_0());
				}
				lv_from_item_1_0=rulefromItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFromSectionRule());
					}
					set(
						$current,
						"from_item",
						lv_from_item_1_0,
						"org.xtext.example.s2c.SQL.fromItem");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulefromItem
entryRulefromItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromItemRule()); }
	iv_rulefromItem=rulefromItem
	{ $current=$iv_rulefromItem.current; }
	EOF;

// Rule fromItem
rulefromItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_table_name_0_0=RULE_ID
					{
						newLeafNode(lv_table_name_0_0, grammarAccess.getFromItemAccess().getTable_nameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFromItemRule());
						}
						setWithLastConsumed(
							$current,
							"table_name",
							lv_table_name_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				otherlv_1='('
				{
					newLeafNode(otherlv_1, grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFromItemAccess().getSelect_exprSelectParserRuleCall_0_1_1_0());
						}
						lv_select_expr_2_0=ruleselect
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFromItemRule());
							}
							set(
								$current,
								"select_expr",
								lv_select_expr_2_0,
								"org.xtext.example.s2c.SQL.select");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_3=')'
				{
					newLeafNode(otherlv_3, grammarAccess.getFromItemAccess().getRightParenthesisKeyword_0_1_2());
				}
			)
		)
		(
			otherlv_4='JOIN'
			{
				newLeafNode(otherlv_4, grammarAccess.getFromItemAccess().getJOINKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFromItemAccess().getRhsFromItemParserRuleCall_1_1_0());
					}
					lv_rhs_5_0=rulefromItem
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFromItemRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_5_0,
							"org.xtext.example.s2c.SQL.fromItem");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6='ON'
			{
				newLeafNode(otherlv_6, grammarAccess.getFromItemAccess().getONKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFromItemAccess().getBool_exprBoolExpressionParserRuleCall_1_3_0());
					}
					lv_bool_expr_7_0=ruleboolExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFromItemRule());
						}
						set(
							$current,
							"bool_expr",
							lv_bool_expr_7_0,
							"org.xtext.example.s2c.SQL.boolExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRulewhere_clause
entryRulewhere_clause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhere_clauseRule()); }
	iv_rulewhere_clause=rulewhere_clause
	{ $current=$iv_rulewhere_clause.current; }
	EOF;

// Rule where_clause
rulewhere_clause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WHERE'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhere_clauseAccess().getWHEREKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhere_clauseAccess().getBool_exprBoolExpressionParserRuleCall_1_0());
				}
				lv_bool_expr_1_0=ruleboolExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhere_clauseRule());
					}
					set(
						$current,
						"bool_expr",
						lv_bool_expr_1_0,
						"org.xtext.example.s2c.SQL.boolExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleboolExpression
entryRuleboolExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolExpressionRule()); }
	iv_ruleboolExpression=ruleboolExpression
	{ $current=$iv_ruleboolExpression.current; }
	EOF;

// Rule boolExpression
ruleboolExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBoolExpressionAccess().getLhsTermParserRuleCall_0_0());
				}
				lv_lhs_0_0=ruleTerm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
					}
					set(
						$current,
						"lhs",
						lv_lhs_0_0,
						"org.xtext.example.s2c.SQL.Term");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='OR'
			{
				newLeafNode(otherlv_1, grammarAccess.getBoolExpressionAccess().getORKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBoolExpressionAccess().getRhsTermParserRuleCall_1_1_0());
					}
					lv_rhs_2_0=ruleTerm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_2_0,
							"org.xtext.example.s2c.SQL.Term");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	iv_ruleTerm=ruleTerm
	{ $current=$iv_ruleTerm.current; }
	EOF;

// Rule Term
ruleTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTermAccess().getLhsFactorParserRuleCall_0_0());
				}
				lv_lhs_0_0=ruleFactor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTermRule());
					}
					set(
						$current,
						"lhs",
						lv_lhs_0_0,
						"org.xtext.example.s2c.SQL.Factor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='AND'
			{
				newLeafNode(otherlv_1, grammarAccess.getTermAccess().getANDKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTermAccess().getRhsFactorParserRuleCall_1_1_0());
					}
					lv_rhs_2_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTermRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_2_0,
							"org.xtext.example.s2c.SQL.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	iv_ruleFactor=ruleFactor
	{ $current=$iv_ruleFactor.current; }
	EOF;

// Rule Factor
ruleFactor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='NOT'
			{
				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getNOTKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_0_1_0());
					}
					lv_factor_1_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"factor",
							lv_factor_1_0,
							"org.xtext.example.s2c.SQL.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getExprBoolExpressionParserRuleCall_1_1_0());
					}
					lv_expr_3_0=ruleboolExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"expr",
							lv_expr_3_0,
							"org.xtext.example.s2c.SQL.boolExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
			}
		)
		    |
		otherlv_5='TRUE'
		{
			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getTRUEKeyword_2());
		}
		    |
		otherlv_6='FALSE'
		{
			newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getFALSEKeyword_3());
		}
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getFactorAccess().getBinexpBinaryParserRuleCall_4_0());
				}
				lv_binexp_7_0=ruleBinary
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFactorRule());
					}
					set(
						$current,
						"binexp",
						lv_binexp_7_0,
						"org.xtext.example.s2c.SQL.Binary");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBinary
entryRuleBinary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBinaryRule()); }
	iv_ruleBinary=ruleBinary
	{ $current=$iv_ruleBinary.current; }
	EOF;

// Rule Binary
ruleBinary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryAccess().getLhsColumnParserRuleCall_0_0());
				}
				lv_lhs_0_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryRule());
					}
					set(
						$current,
						"lhs",
						lv_lhs_0_0,
						"org.xtext.example.s2c.SQL.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0());
			}
			    |
			otherlv_2='>'
			{
				newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1());
			}
			    |
			otherlv_3='='
			{
				newLeafNode(otherlv_3, grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2());
			}
			    |
			otherlv_4='>='
			{
				newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3());
			}
			    |
			otherlv_5='<='
			{
				newLeafNode(otherlv_5, grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBinaryAccess().getRhsColumnParserRuleCall_2_0());
				}
				lv_rhs_6_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBinaryRule());
					}
					set(
						$current,
						"rhs",
						lv_rhs_6_0,
						"org.xtext.example.s2c.SQL.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getColumnRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRulegroup_clause
entryRulegroup_clause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroup_clauseRule()); }
	iv_rulegroup_clause=rulegroup_clause
	{ $current=$iv_rulegroup_clause.current; }
	EOF;

// Rule group_clause
rulegroup_clause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GROUP'
		{
			newLeafNode(otherlv_0, grammarAccess.getGroup_clauseAccess().getGROUPKeyword_0());
		}
		otherlv_1='BY'
		{
			newLeafNode(otherlv_1, grammarAccess.getGroup_clauseAccess().getBYKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGroup_clauseAccess().getExpressionsExpressionParserRuleCall_2_0());
				}
				lv_expressions_2_0=ruleexpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGroup_clauseRule());
					}
					add(
						$current,
						"expressions",
						lv_expressions_2_0,
						"org.xtext.example.s2c.SQL.expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getGroup_clauseAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGroup_clauseAccess().getExpressionsExpressionParserRuleCall_3_1_0());
					}
					lv_expressions_4_0=ruleexpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGroup_clauseRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_4_0,
							"org.xtext.example.s2c.SQL.expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulehaving_clause
entryRulehaving_clause returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHaving_clauseRule()); }
	iv_rulehaving_clause=rulehaving_clause
	{ $current=$iv_rulehaving_clause.current; }
	EOF;

// Rule having_clause
rulehaving_clause returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='HAVING'
		{
			newLeafNode(otherlv_0, grammarAccess.getHaving_clauseAccess().getHAVINGKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHaving_clauseAccess().getExprBoolExpressionParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleboolExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHaving_clauseRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.example.s2c.SQL.boolExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleexpression
entryRuleexpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleexpression=ruleexpression
	{ $current=$iv_ruleexpression.current; }
	EOF;

// Rule expression
ruleexpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='*'
		{
			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getAsteriskKeyword_0());
		}
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_1_0());
				}
				lv_col_1_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"col",
						lv_col_1_0,
						"org.xtext.example.s2c.SQL.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		otherlv_2='count()'
		{
			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getCountKeyword_2());
		}
		    |
		(
			otherlv_3='sum('
			{
				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getSumKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_3_1_0());
					}
					lv_col_4_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"col",
							lv_col_4_0,
							"org.xtext.example.s2c.SQL.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

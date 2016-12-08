/*
 * generated by Xtext 2.10.0
 */
package org.xtext.twitter.twt.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import twitterRESTAPI.Deck
import twitterRESTAPI.WebPage
import twitterRESTAPI.Expression
import twitterRESTAPI.ExprSimple
import twitterRESTAPI.And
import twitterRESTAPI.Or
import twitterRESTAPI.Not
import twitterRESTAPI.Type
import twitterRESTAPI.Place
import twitterRESTAPI.Date
import twitterRESTAPI.Hashtag
import twitterRESTAPI.User
import twitterRESTAPI.Operation
import twitterRESTAPI.equals
import twitterRESTAPI.lessThan
import twitterRESTAPI.upperThan

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TwitterRESTAPIGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	def compile(WebPage wp) '''
		// TODO
		�for (Deck d : wp.deck) {
			d.compile
		}�
	'''
			
	
	
	def compile(Deck d) '''
	// TODO
	�d.name�
	�d.expression.compile�
	'''
	
	/***********************************
	 * EXPRESSIONS
	 ***********************************/
	def compile(Expression e) '''
	�switch(e) {
		case ExprSimple : ((ExprSimple) e).compile
		case And: ((And) e).compile
		case Or: ((Or) e).compile
		case Not: ((Not) e).compile
		default: e.class.name
		}�
	'''
	
	def compileExprS(ExprSimple es) '''
	�IF (es.type.class.name.equals("User") || es.type.class.name.equals("Hashtag")) && !es.operation.class.equals("equals")�
	ERREUR : Op�ration incoh�rente par rapport au type propos�
	�ELSE�
		�switch(es.type) {
			case User : es.type.compile(es.operation, es.value)
			case Hashtag : es.type.compile(es.operation, es.value)
			case Date : es.type.compile(es.operation, compileValueDate(es.value))
			case Place : es.type.compile(es.operation, compileValuePlace(es.value))
			default : es.type.class.name
			}�
	�es.operation.compile�
	�es.value�
	�ENDIF�
	'''
	
	def compile(And a) '''
	�a.exp1.compile� && �a.exp2.compile�
	'''
	
	def compile(Or o) '''
	�o.exp1.compile� || �o.exp2.compile�
	'''
	
	def compile(Not n) '''
	! �n.exp.compile�
	'''
	
	/***********************************
	 * TYPES
	 ***********************************/
	def compile(Type t) '''
	��
	'''
	
	def compile(User u, Operation o, String v) '''
	'''
	
	def compile(Hashtag h, Operation o, String v) '''
	'''
	
	def compile(Date d) '''
	'''
	
	def compile(Place p) '''
	'''
	
	/***********************************
	 * OPERATIONS
	 ***********************************/
	 def compile(Operation o)'''
	 '''
	 
	 def compile(equals e) '''
	 '''
	 
	 def compile(lessThan l) '''
	 '''
	 
	 def compile(upperThan u) '''
	 '''
	
	/***********************************
	 * VALUES COMPILE
	 ***********************************/
	 def compileValueDate(String s) {
	 	
	 }
	 
	 def compileValuePlace(String s) {
	 	
	 }
	
}

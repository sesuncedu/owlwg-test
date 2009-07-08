package com.clarkparsia.owlwg.owlapi3.testcase.impl;

import org.semanticweb.owlapi.model.OWLOntology;

import com.clarkparsia.owlwg.testcase.InconsistencyTest;
import com.clarkparsia.owlwg.testcase.TestCaseVisitor;

/**
 * <p>
 * Title: OWLAPIv3 Inconsistency Test Case
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright &copy; 2009
 * </p>
 * <p>
 * Company: Clark & Parsia, LLC. <a
 * href="http://clarkparsia.com/"/>http://clarkparsia.com/</a>
 * </p>
 * 
 * @author Mike Smith &lt;msmith@clarkparsia.com&gt;
 */
public class OwlApi3IncTstImpl extends OwlApi3xCTImpl implements InconsistencyTest<OWLOntology> {

	public OwlApi3IncTstImpl(org.semanticweb.owl.model.OWLOntology ontology,
			org.semanticweb.owl.model.OWLIndividual i) {
		super( ontology, i );
	}

	public void accept(TestCaseVisitor<OWLOntology> visitor) {
		visitor.visit( this );
	}

	@Override
	public String toString() {
		return String.format( "InconsistencyTest(%s)", getIdentifier() );
	}
}

package graphql.validation.rules;


import graphql.validation.AbstractRule;
import graphql.validation.ErrorCollector;
import graphql.validation.ValidationContext;

public class OverlappingFieldsCanBeMerged extends AbstractRule{

    public OverlappingFieldsCanBeMerged(ValidationContext validationContext, ErrorCollector errorCollector) {
        super(validationContext, errorCollector);
    }
}

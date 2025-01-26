package lesson_5_string.string_pipeline.simple_pipeline.operations;

import lesson_5_string.string_pipeline.simple_pipeline.StringOp;
import lesson_5_string.string_pipeline.simple_pipeline.StringContainer;

public class NotNullFilter implements StringOp {

    @Override
    public StringContainer doAction(StringContainer container) {
        if (container.isExists() && container.getValue() == null) {
            return StringContainer.emptyContainer();
        }
        return container;
    }
}
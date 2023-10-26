package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.CopyApplicantCommand;

public class CopyApplicantCommandParserTest {

    private final CopyApplicantCommandParser parser = new CopyApplicantCommandParser();

    @Test
    public void parse_validArgs_returnsCopyApplicantCommand() {
        assertParseSuccess(parser, "1", new CopyApplicantCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                CopyApplicantCommand.MESSAGE_USAGE));
    }
}

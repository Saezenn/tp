package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.CopyMemberCommand;

public class CopyMemberCommandParserTest {

    private final CopyMemberCommandParser parser = new CopyMemberCommandParser();

    @Test
    public void parse_validArgs_returnsCopyMemberCommand() {
        assertParseSuccess(parser, "1", new CopyMemberCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                CopyMemberCommand.MESSAGE_USAGE));
    }
}

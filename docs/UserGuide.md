---
layout: default.md
title: "User Guide"
pageNav: 3
---

# EzContact

EzContact is a

* desktop app for managing contacts, optimized for use via a  Line Interface (CLI)
* while still having the benefits of a Graphical User Interface (GUI).
* If you can type fast, EzContact can get your contact management tasks done faster than traditional GUI apps.

<!-- * Table of Contents -->
<page-nav-print />

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

2. Download the latest `ezcontact.jar` from [here](https://github.com/AY2324S1-CS2103T-W16-2/tp/releases).

3. Copy the file to the folder you want to use as the _home folder_ for your EzContact.
4. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar ezcontact.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)
5. Type the command in the command box and press Enter to execute it.
1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

<box type="info" seamless>

**Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</box>


### Adding a person: `add`

Adds a person to the contact book.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL [a/ADDRESS]`

<box type="warning" seamless>

**Caution:** A person must have a name, phone number and email address to be a valid entry.
</box>

<box type="info" seamless>

**Note:**

* Name can not be longer than 64 characters

* Only allows Singapore phone number `e.g. 8 digits`
</box>

Examples:
* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01`
* `add n/Betsy Crowe e/betsycrowe@example.com p/12345678`

### Listing all persons : `list`

Shows a list of all existing contacts in the contact book.

Format: `list`

<box type="warning" seamless>

**Caution:** A list command does not take in parameters e.g. `list 1`, `list first`, `list all` will be invalid.

Examples:
* `list` shows a list of all existing contacts

</box>

### Deleting a person : `delete`

Deletes the specified contact from the address book.

Format: `delete INDEX`
* Deletes the person at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The `INDEX` is 1-indexed

<box type="warning" seamless>

**Caution:** The index **must be a positive integer** 1, 2, 3, ...
</box>


Examples:
* `list` followed by `delete 2` deletes the 2nd person in the address book.
* `find Betsy` followed by `delete 1` deletes the 1st person in the results of the `find` command.


### Editing a person : `edit`

Edits an existing person in the address book.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS]`

* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* Tags are not editable.

Examples:
*  `edit 1 p/91234567 e/jiufong@example.com` Edits the phone number and email address of the 1st person to be `91234567` and `jiufong@example.com` respectively.
*  `edit 2 n/Betsy Crower` Edits the name of the 2nd person to be `Betsy Crower`.

### Finding persons : `find`

Finds customers whose names contain all the given keywords.

Format: `find KEYWORD [MORE_KEYWORD]`

* The search is case-insensitive. e.g. `find Adam` returns `adam`
* The order of the keywords does not matter. e.g.`find Adam Leong` returns `Leong Adam` or `Adam Chen Leong`
* Only the name information is searched.
* Only the customers matching all the keywords will be returned e.g. `find Adam Leong` return `Adam Leong Keng Fat` but not `Adam Huat`

Examples:
* `find Adam Huat` Finds all the customers whose name contains `Adam` and  `Huat`
* `find Song` Finds all the customers whose name contains `Song`



### Exiting the program : `exit`

Exits the program.

Format: `exit`



_More coming soon ..._

--------------------------------------------------------------------------------------------------------------------

## Command summary

| Action     | Format, Examples                                                                                                                          |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| **Add**    | `add n/NAME p/PHONE_NUMBER e/EMAIL [a/ADDRESS]` <br> e.g., `add n/James Ho p/22224444 e/jamesho@example.com a/123, Clementi Rd, 1234665 ` |
| **Delete** | `delete INDEX`<br> e.g., `delete 3`                                                                                                       |
| **Edit**   | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`<br> e.g.,`edit 2 n/James Lee e/jameslee@example.com`               |
| **List**   | `list`                                                                                                                                    |
| **Find**   | `find NAME`                                                                                                                               |

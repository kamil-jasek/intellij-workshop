# WORKSHOP MANUAL

## What's the goal here?

1. Limit distraction during your work
2. Make you work more efficient and productive

<hr/>

**In the manual you will find a lot of shortcuts. Shortcuts in parentheses are dedicated to macOS.**

## I. SUPPORTING PLUGINS, RESOURCES & SYSTEM CHANGES

1. Intellij Plugins:
    1. Key Promoter X
    2. Presentation Assistant
2. Resources:
    1. Default Keyboard shortcuts PDF `HELP -> Keyboard Shortcuts`
    2. [Intellij Documentation](https://www.jetbrains.com/help/idea/getting-started.html)
    3. My Productivity `HELP -> My Productivity`
3. System changes:
    1. caret speed
    2. disable FN key if enabled

## II. NO DISTRACTION

You must be focused on code and editor and avoid using mouse/touchpad.
So, let's start with next steps and in the `View -> Appearance`:

1. hide tabs
2. hide navigation bar
3. hide tool window bars
4. hide all tool windows, show only editor: `CTRL(CMD)+SHIFT+F12`

## III. HOW TO NAVIGATE?

### 1. Search everywhere

If you are looking for some setting, and you don't know the shortcut or where to find it then
press `2xSHIFT (double shift)`. It's your rescue option.

Additionally, you can set up specific settings by turning them on/off. You can also find those
settings by starting your search with `/`, for example try: `/appearance`.
<hr/>

You can also search for URL mappings. If you have controllers in your Spring application then in the
search everywhere you can type part of the URL.

#### Try it!

```
1. Open Terminal Tool Window
2. Enter & exit presentation mode
3. Enable/Disable line numbers in editor
4. Find some rest controllers
```

### 2. Tool windows

Tool window is a Project View, Bookmarks, Structure, Debugger, Git etc. You can navigate between
them by using `ALT(CMD)+0..9`, example for Project View: `ALT(CMD)+1`.

Default shortcuts for tool windows can be found in the `View -> Tool Windows`. Shortcuts can be
configured in `Preferences -> Keymap` or find them via `search everywhere 2xSHIFT`.

If you open any Tool Window then you can do next things:

1. Go back to Editor `ESC`
2. Jump to last Tool Window `F12`
3. Close active Tool Window `CTRL+F4 (CMD+W)`
4. Close all Tool Windows `CTRL+SHIFT+F12`
5. Change size of active Tool Window by using keys: `CTRL+ALT+SHIFT+L|R|U|D (ALT+CTRL+L|R|U|D)`

<hr/>

#### Try it!

```
1. Try different shortcuts, open and close different Tool Windows.
2. Try to change size of Tool Windows by using keyboard shortcuts.
2. Default configuration is not perfect for your needs. Adjust it, so you feel comfortable with it.
   For example: reorder `Bookmarks` with `Git`, add shortcut for `Maven`.
```

### 3. Actions

It's like a search everywhere but narrowed to only actions, for example: `Run...`.
Default shortcut is: `CTRL(CMD)+SHIFT+A`.
<hr/>

#### Try it!

```
1. Find `Run...` and run application `IntellijApplication`, 
2. Find `Stop` and stop your application. 
```

### 4. Files, classes, symbols

There are several ways for source files navigation. Very quickly you can find files, classes and
class members by using next shortcuts:

1. **Files** `CTRL+SHIFT+N` (`CMD+SHIFT+O`) - find any file in the project or everywhere (press
   again the same shortcut). You can narrow your search to some directories when you use: `/`, for
   example: `/src/main/app.prop` or even in shorter way: `/s/m/a.p`.
2. **Classes** `CTRL+N(O)` - find any class in the project or everywhere (press again the
   same shortcut). It's using camel case search which is very intuitive.
3. **Symbols** (class members) `CTRL+ALT+SHIFT+N (CMD+ALT+O)` - quick way to find a method with
   given name. You can narrow your search with class prefix, for example: `Intell.main`

There is one hidden option - if you want to open file at specific line number, you can add this to
your query, for example: `InteApp:10`
<hr/>

#### Try it!

```
1. Try to find most popular files like: `pom.xml` or `application.properties`.
2. Try to find some classes by using camel case search.
3. Try to find `createOrder` method, try to find it by using prefix of OrderFacade class.
4. Open `IntellijApplication` class at line 10.
```

### 5. Switcher, Recent files and locations

Don't use tabs, use better tools to navigate between classes that you recently opened/edited.

1. **Switcher** `(HOLD)CTRL+TAB`: quickly change file to recently opened or open Tool Window
   by pressing digit or letter assigned to it.
2. **Recent Files** `CTRL+E`: show recently opened/edited(hit again shortcut) files.
   Change file in editor by pressing:
    1. `ENTER` - open and move caret to file
    2. `CTRL+ENTER` - open but not move caret
    3. `SHIFT+ENTER` - open in new split view
3. **Recent Locations** `CTRL+SHIFT+E`: shows recently opened/edited(hit shortcut again) code
   locations. If you start typing you can quickly find your target.

<hr/>

#### Try it!

```
1. Play with the Switcher - jump to previous file, open Commit Tool Window.
2. Try Recent Files and all modes of opening files.
3. Try Recent Locations to find recently opened/edited code locations.
```

### 6. Navigation Bar

Navigation bar can be used to explore project files instead of Project View.
Big advantage of navigation bar is that it's visible only when exploring project structure.
It can be used for:

1. navigation
2. quickly check the package name/class location
3. quick source files creation.

<hr/>

#### Try it!

```
1. Use `ALT+UP (CMD+DOWN)` to open navigation bar.
2. Navigate to `IntellijApplication` class, open it with `ENTER`, then try again and open it
   with `SHIFT+ENTER`.
3. Navigate to `src/main/resources` and create here any new text file. 
``` 

### 7. Project View

It's mostly used to explore project files. By default `ALT+1 (CMD+1)` is used to open this tool
window. You can navigate between directories and files by using arrows.

Files can be open with few ways:

1. `ENTER` - open file and move focus to editor
2. `CTRL+ENTER` - open file, don't move focus to editor
3. `SHIFT+ENTER` - open in split view

By using `CTRL+N` you can create new files and directories in the project structure.

If you want to quickly see where currently opened file is located in the project view then you can
use: `Select Opened File` option: `ALT+F1` + `1`. This shortcut can be simplified by adding new
shortcut.

Sometimes you will need to open context menu (right mouse click) to access some options in case
when you don't remember specific shortcut. There is no configured shortcut to open context menu by
default. You can configure it in Keymap settings.

#### Try it!

```
1. Open Project View and navigate without mouse/touchpad.
2. Try to open files in many ways
3. Create new files and classes with shortcut `CTRL+N`
4. Try `Select Opened File` - configure shortcut
5. Configure shortcut to open context menu
``` 

### 8. Bookmarks - speed up navigation to hot code in your project

Very useful in big projects where you have some code which is very often changed or extended with
new features. There are few ways to create and navigate between bookmarks:

1. Bookmark Tool Window can be opened with shortcut: `ALT+2 (CMD+2)`. Here you can navigate between
   all created bookmarks.
2. To create a bookmark go to some file at any line and press `F11 (F3)`. Now this bookmark will be
   visible in the Bookmark Tool Window.
3. Better option is to create mnemonic bookmark that will speed up navigation.
   Press `CTRL+F11 (ALT+F3)`. Select digit or letter for a bookmark. You can also add name for a
   bookmark.
4. Now, you can very quickly navigate between mnemonic bookmarks, just press `CTRL+{mnemonic}` - if
   shortcut doesn't work then probably it's already assigned to existing action.
5. Additionally, you can open `Go to Mnemonic` popup and quickly navigate to mnemonic bookmarks.
   Press `CTRL+SHIFT+F11 (CMD+ALT+F3)`.
6. You can also navigate between all bookmarks by using: `CTRL(CMD)+ALT+UP|DOWN`

<hr/>

#### Try it!

```
1. Create mnemonic bookmark to `pom.xml` and `IntellijApplication.main()`
2. Navigate with `CTRL+{mnemonic}`
3. Navigate with `CTRL+SHIFT+F11 (CMD+ALT+F3)`
4. Navigate via `CTRL(CMD)+ALT+UP|DOWN`
5. Check you bookmarks in Bookmark Tool Window
``` 

## IV. WORKING WITH CODE EDITOR

### 1. Navigation in the Editor

#### 1.1. Moving caret & code selection

There are many ways to move caret in the editor, some of them are (check shortcuts for Lin/Win):

1. Move to the next word: `ALT+RIGHT|LEFT` (add `SHIFT` if you're selecting text)
2. Move to line start/end: `CTRL(CMD)+RIGHT|LEFT` (add `SHIFT` if you're selecting text)
3. Move to code block start/end: `CTRL(ALT+CMD)+[|]`

If you want to select code statements always use: `CTRL+W (CMD+UP)`, use it few times to extend
selection. If you want to shrink selection then use: `CTRL+SHIFT+W (CMD+DOWN)`.
<hr/>

#### Try it!

```
1. Try to move caret in many ways in code
2. Try statements selection with extending & shrinking
```

#### 1.2. Scrolling

If you decided to avoid using mouse/touchpad then scrolling shortcuts can be helpful. By default,
scrolling shortcuts are not configured. You can configure them in the `Keymap`, find next actions:
Scroll Up|Down (and Move if necessary), Page Up|Down (and Select Row) - options in parentheses are
dedicated to cursor movement.
<hr/>

#### Try it!

```
1. Configure shortcuts for scrolling with keyboard
2. Learn them :)
```

#### 1.3. Class structure

If you want to quickly evaluate a big class you can use Structure Tool Window `ALT(CMD)+7`. There is
possibility to navigate between class members and filter out them in many ways:

1. see methods, fields and properties
2. see only public members
3. see inherited class members

Instead of switching to Tool Window you can press in the editor: `CTRL(CMD)+F12` - then a popup with
class structure will appear. In the popup you can type and find interesting class members quickly
navigating to them.

#### Try it!

```
1. Open Structure Tool Window for `CorsFilter` class, play with the filters and navigate to class members.
2. Open Class Structure popup and try to navigate between class memebers.
```

#### 1.4. Jumping between methods and usages

If you want quickly jump in the editor to the next or previous method then you can use next
shortcut: `ALT+UP|DOWN (CTRL+SHIFT+UP|DOWN)`.

Sometimes you want to see where a given field, method or variable is used in the class or method.
For that, put your caret on interesting field/method/variable and use Go to next/previous
highlighted usage: `(CTRL+ALT+UP|DOWN) check shortuct for Linux/Win`.
<hr/>

#### Try it!

```
1. Open for example String class and jump to the next and previous methods with shortcut.
2. Try to jump between field/method/variable usages in String class.
```

### 2. Code exploration

During code analysis very often you will need to see details of other methods, constructors or
fields. To do that you have some options like:

1. jump to source: `F4 (CMD+DOWN) or CTRL(CMD)+B` - it can be used on anything: classes, methods,
   fields, variables, packages
2. if you don't want to switch a file then in this case you can use quick definition
   popup: `CTRL+SHIFT+I (ALT+SPACE)`
3. if you work with some abstraction then maybe you wish to open specific implementation of method.
   For that use go to implementation: `CTRL(CMD)+ALT+B`.
4. when you work with some concrete class then maybe you wish to see superclass details, there is a
   shortcut for that: `CTRL(CMD)+U`. There is also an option to see inheritance diagram in the
   popup: `CTRL(CMD)+ALT+U`.
5. if you don't want go to the implementation to see details about type then you can
   use: `CTRL+SHIFT+P` or if you wish to see method parameters then use: `CTRL+P`.
6. sometimes you have to find usages of given method or field. This is possible in 2 ways:
    1. `ALT+F7` will open Find Tool Window where you can see usages grouped in a few categories.
    2. `CTR(CMD)L+ALT+F7` will open a popup with usages, and you can filter them by typing text or
       selecting many options in the bar.

When you are exploring classes then you will need to go backward and forward quickly. In this
situation use: `CTRL+ALT+LEFT|RIGHT`.
<hr/>

#### Try it!

```
1. Open for example InputStreamReader class and explore it with shortucts.
```

### 3. Writing code

#### 3.1. File templates

Firstly, you have to create new file or class. You can use standard templates that are defined in
Intellij, but also you can configure your own. File and code templates can be found
in `Preferences -> Editor -> File and code templates`.
<hr/>

#### Try it!

```
1. Change default java class template - remove public keyword and add final
2. Configure your own spring module template containig entity, repository, facade/service and controller.
```

#### 3.2. Code templates

Use code generation as much as possible. It limits your typing errors. There are few tools in
Intellij that can help you:

1. Live templates - quickly generate with abbreviations code parts. For example, in the java class
   type `psvm` and hit enter to generate `main` method. You can define your own live templates
   in `Preferences -> Editor -> Live templates`.
2. Postfix templates - when you type some statement in the end you can add postfix, for
   example: `yourVariable.nonnull` then after hitting enter this code will be replaced with if
   statement and non-null verification. There is no built-in configuration to change or extend
   postfix templates but there is a plugin: `Custom Postfix Templates`.
3. Surrounding templates - similar to postfix templates - with the shortcut: `CTRL+ALT+T` you can
   surround any statement with `if`, `while` or any other block code.

<hr/>

#### Try it!

```
1. Define your own live templates for `private final xxx` fields.
2. Try Custom Postfix Templates plugin.
3. Try surrounding templates.
```

#### 3.3. Code generation

Instead of typing usual methods like equals, hashcode and toString you can generate them. For that
you can use shortcut: `ALT(CMD)+N`. Another way is to generate simple methods like getters/setters
by typing field name in the class and using suggestions provided by Intellij.

There are some plugins that are able to extend Generate popup, for example if you are using UUID as
entity id you can install UUID Generator. It will give you possibility to generate some UUID's for
example in tests.

If you have already implemented some class there is possibility to generate a test class for it. Put
a caret on class name or inside it and press: `CTRL(CMD)+SHIFT+T`. In the popup window you can
define what testing framework to use.
<hr/>

#### Try it!

```
1. Generate equals/hashcode/toString methods.
2. Generate a constructor and getters.
3. Install UUID Generator plugin - generate UUID via this plugin.
4. Generate a test for a class.
```

#### 3.4. Code Completion

When you type anywhere in the editor you have support from Intellij with code completion. Use it as
much as possible to avoid typing mistakes. What kind of code completion you can use:

1. basic completion: `CTRL+SPACE`
2. type matching completion: `CTRL+SHIFT+SPACE`, prefer this one when you want to filter classes
   related to given type
3. variable/method/class name completion depending on context where your caret is placed. Intellij
   uses camel case completion so, your query can be very quick.

<hr/>

#### Try it!

```
1. Compare basic completion with type completion.
```

#### 3.5. ALT+ENTER everywhere

One of the most important shortcuts in the editor is `ALT+ENTER`. It's displaying context actions.
With this tool you can quickly copy text, move variable assignment or fix typical issues without
typing.

If you use `F2` to jump between issues in the file, and then you will press `ALT+ENTER` then
it's possible to quickly fix problems in the code.

`ALT+ENTER` is also very useful during TDD or implementing some prototype. With this shortcut you
can quickly create not existing classes or methods.

<hr/>

#### Try it!

```
1. Try ALT+ENTER in many places: construtors, methods, variables, strings...
2. Start jumping between issues with `F2` and then fix issues with `ALT+ENTER`.
3. Try TDD with `ALT+ENTER`.
```

#### 3.6. Typing shortcuts

There are many shortcuts that can improve you typing in the editor:

1. line breaking:
    1. start new line: `SHIFT+ENTER`
    2. split line: `CTRL(CMD)+ENTER`
2. statement completion (add curly braces or `;`): `SHIFT+CTRL(CMD)+ENTER`
3. duplicate line: `CTRL(CMD)+D`
4. remove line: `CTRL+Y (CMD+BACKSPACE)`
5. moving line up/down: hold `CTRL(CMD)+SHIFT+UP|DOWN`

<hr/>

#### Try it!

```
1. Try all shortucts to improve your typing skills.
```

#### 3.7. Copy/paste from clipboard

A very nice feature in the Intellij is a copy clipboard history. When you copy some text or code
then it's available in the clipboard, press: `CTRTL(CMD)+SHIFT+V` to see it. In the target place you
can paste not only the latest copied text but also a history. Thanks to that you can paste many
things from the clipboard by selecting them.
<hr/>

#### Try it!

```
1. Try copy/paste from clipboard.
```

#### 3.8. Multi cursor

Sometimes you will need to type the same text in few places in the file. To avoid copy/paste
operation you can use multi-cursor feature. Hold `ALT+SHITF` and click in places where you want
additional cursor - start typing. You can also use other shortcuts with multi-cursor, for example
code generation: `ALT(CMD)+N`.
<hr/>

#### Try it!

```
1. Try multi-cursor feature.
```

#### 3.9. Formatting code

It's good practice to format code with your project code style. Intellij has built-in predefined
code styles. You can configure it in the `Preferences -> Editor -> Code Style`. Every project can
use different code style. Automatic formatting can be applied with shortcut: `CTRL(CMD)+ALT+L`.
<hr/>

#### Try it!

```
1. Check your code style settings.
2. Do a mess in the code and then format it with shortcut.
```

#### 3.10. Optimizing imports

When prototyping code or doing refactoring we are importing a lot of dependencies. It's good to keep
our code clean, so for that use optimize imports shortcut: `CTRL+ALT+O`. Imports will be optimized
according to code style.
<hr/>

#### Try it!

```
1. Do some mess in the inports and them optimize them.
```

#### 3.11. Language injection in strings

Sometimes you need to write json or regular expression in string. It's hard to verify if written
code is valid. You can use many tools for that but there is very nice built-in feature. When you
move the caret into a string and find action or press `ALT+ENTER` and
then: `Inject language or reference`, you can choose language to inject. It's nice to set up a
shortcut for this operation.
<hr/>

#### Try it!

```
1. Try json injection.
2. Try regex injection.
3. Add shortcut for Inject language operation.
```

### 4. Code Refactoring

Do you want to move class, method or maybe change its name in a safe way? Use refactoring tools
provided in the Intellij. Always prefer safe refactoring and avoid manual changes. There are many
shortcuts for refactoring, in the beginning remember this one (Refactor
this): `CTRL+ALT+SHIFT+T (CTRL+T)`. With this shortcut you can invoke many refactoring operations:

1. rename: `SHIFT+F6`
2. move: `F6`
3. change signature of class or method: `CTRL(CMD)+F6`
4. inline variable/method: `CTRL(CMD)+ALT+N`
5. extract method: `CTRL(CMD)+ALT+M`
6. introducing:
    1. variable: `CTRL(CMD)+ALT+V`
    2. constant: `CTRL(CMD)+ALT+C`
    3. parameter: `CTRL(CMD)+ALT+P`
    4. parameter object: no configured shortcut
    5. functional parameter: `CTRL(CMD)+ALT+SHIFT+P`
    6. functional variable: no configured shortcut
7. extract interface/delegate/superclass: no configured shortcut

<hr/>

#### Try it!

```
1. Try to refactor a code without manual modifications, use only refactoring shortcuts.
2. Configure missing shortcuts if you we will need them more frequently.
```

## V. BUILDING CODE & EXECUTING TESTS

### 1. Built-in compiler

When your implementation is ready then would be good to build project with maven and maybe run it
locally. Let's start with building. You can compile your project with: `CTRL(CMD)+F9`. This
operation is using built-in compiler, but maybe you prefer to run specific task of your build. For
that you can use mvn or any other build tool.

### 2. Maven tasks

There are dedicated tool windows for building tools.
If you open for example Maven Tool Window (shortcut is not configured by default) then you can
execute any task, for example: clean and compile. You can also create run configurations from this
place.

### 3. Run anything

Maven (or any other build system) tasks can be also executed with Run anything... By default, there
is no shortcut for this feature, so you can configure it. Run anything is giving you a possibility
to execute few tasks at once, for example `mvn clean test`.

### 4. Run...

Running application or any other run configuration can be done with Run
popup: `ALT+SHIFT+F10 (CTRL+ALT+R)`. If you hold `SHIFT` then you can switch to debug mode or use
Debug popup: `ALT+SHIFT+F9 (CTRL+ALT+D)` for that.
<hr/>

#### Try it!

```
1. Try execute built-in compilation.
2. Execute maven tasks with tool windown and Run anything feature.
2. Start your application with Run or Debug.
```

### 5. Executing tests

There are many ways how you can execute tests for your application. You can use:

1. maven task: `mvn test`
2. run them from Project View with shortcut: `CTRL+SHIFT+F10(R)` or `CTRL+SHIFT+F9(D)` for debug.
   You can select:
    1. all tests package
    2. specific package
    3. some test classes
3. run in the test class with `CTRL+SHIFT+F10(R)` or `CTRL+SHIFT+F9(D)` for debug:
    1. all tests if caret is outside of method
    2. specific method if caret is inside it
4. run preconfigured with Run popup: `ALT+SHIFT+F10 (CTRL+ALT+R)`
5. run preconfigured with Run anything popup

<hr/>

#### Try it!

```
1. Try different ways to execute your tests.
2. Decide what is the best way for you to execute tests.
```

## VII. WORKING WITH DEBUGGER

### 1. Breakpoints

Debugger is a tool that will help you with finding bugs or investigating how some implementation
works. To work with debugger you have to use breakpoints. Breakpoint can be added to code line with
shortcut: `CTRL(CMD)+F8` or with more configurable way: `CTRL(CMD)+SHIFT+F8`.

What kind of features with breakpoints you can use:

1. suspending:
    1. all threads
    2. single thread
2. non suspending - with this one you can evaluate variables, print log or change values on the fly.
3. conditional - execution of breakpoint depends on some boolean expression. Breakpoint will be
   executed only if condition is met.
4. evaluating - you can log some variable values or even change value on the fly.
5. enabled/disabled - you don't need to remove breakpoints, it's possible to disable them if not
   needed.

All breakpoints can be muted if you want to resume your program without further debugging. There is
no configured shortcut to mute breakpoints, but you can add it.

### 2. Manipulate program behaviour

There are a few options to change program behaviour with the debugger:

1. change value of variable - in the debugger window you can select interesting variable and set a
   new value to it.
2. force to throw an exception - using thread stack frames window you can open context menu and then
   use Force Exception
3. force to return a value - using thread stack frames window you can open context menu and then use
   Force Return

Sometimes you will need to execute the same part of code few times and don't want to go from
beginning of your debugging process. There is a way to Reset frames and go back one or more steps.
To do that, you have to select interesting thread stack frame and from context menu choose Reset
frame.

### 3. Evaluate expressions

When you're debugging any code maybe you wish to check some of your assumptions. Very nice tool for
that is Evaluate Expressions, shortcut: `ALT+F8`. With that tool, you can check:

1. what is the result of some method
2. you can copy/paste some code, change it and evaluate result
3. you can change current variable values

Every time when you restart the debugger you have to type the same expressions to evaluate them.
There is a nice way to improve it - use watches. In the debugger you can add watches for variables
or expressions. Thanks to that you can observe how values are changing during debug process. If you
want to see watches in the editor you can use inline watches.

### 4. Marking objects

There are situations when you need to verify some object across many threads or methods invocations,
and you want to be sure about watching the same instance of object. For that purpose you can mark
it. Firstly, start the debugger, find interesting instance of object and press: `F3` to mark it.
Now, you can observe it in different threads or method invocations.

### 5. Debugging lambdas

Debugging lambdas is a quite hard task. There is one nice option in Intellij to make it easier -
Stream trace. Put your breakpoint in the line where is your stream, run the debugger and in its
window find option Stream Trace. When you open it you can visually analyze how the stream is
executing.

## BONUS VIII. WORKING WITH GIT

### 1. Branches

Switching to existing branch or creating new one can be done with shortcut: <code>
CTRL+SHIFT+`</code>. It will open Branches popup where you can find all remote and local branches.
Now, you can do:

1. checkout to any branch/tag or revision
2. create new branch
3. fetch updates from remote

### 2. Commit & Push

If you want to review or commit quickly your changes then use shortcut: `CTRL(CMD)+K`. It will open
Commit Tool Window where you will find all your changes. You can select what you want to commit and
what commit message to add.

After committing your changes they can be pushed to remote with shortcut `CTRL(CMD)+SHIFT+K`. In the
popup window you can review what will be pushed, and it's possible to push with force if needed.

### 3. Pull & Resolve conflicts

Pulling latest changes from remote can be done with Pull action - there is no configured shortcut by
default. In the Pull popup window you can select remote branch and add additional settings
like `--rebase`. Sometimes pull operation will end with conflicts. Intellij has a nice tool that
helps with resolving conflicts. With this tool you can compare remote changes with yours and decide
how to merge them.

### 4. Git log & Rebasing

There is a Git Tool Window where you will find all local and remote branches with their commits.
This tool window can be opened with shortcut: `ALT(CMD)+9`. With this tool window you can do a lot
of things:

1. review git log
2. edit commit message
3. revert/undo/drop commits
4. squash commits
5. checkout to specific commit
6. cherry-pick commits
7. compare

## Bonus IX. Pull Requests with GitHub

## Bonus X. Scratches

## Bonus XI. Structural Search

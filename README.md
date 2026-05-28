# Java DSA Repository

Welcome to the Java Data Structures and Algorithms repository.

## Instructions for AI Agents

This repository is maintained with the help of AI agents. If you are an AI agent accessing or modifying this repository, **you MUST adhere to the following strict rules**:

### 1. Repository Structure
The repository is structured strictly by **Data Structure (DS)** at the top level, and **algorithmic concepts** within that DS at the second level. Do not deviate from this hierarchy.

**Supported Structure Hierarchy:**
- `arrays_and_hashing/`
  - `basics/`
  - `two_pointers/`
  - `sliding_window/`
- `linked_list/`
  - `singly_linked_list/`
  - `fast_and_slow_pointers/`
- `trees/`
  - `binary_tree/`
  - `binary_search_tree/`
- `graphs/`
  - `bfs/`
  - `dfs/`
- `dynamic_programming/`
  - `1d_dp/`
  - `2d_dp/`
- `backtracking/`
- `math_and_geometry/`
- `greedy/`

*(If a new category is absolutely necessary, ensure it follows `snake_case` naming and fits logically into this DS/Concept hierarchy).*

### 2. File Naming Convention
When adding new problem solutions, the file name **MUST** be named based on the problem it solves, using `PascalCase.java` (standard Java class naming).
- Example: `GreatestCommonDivisor.java`, `SudokuSolver.java`.
- The public class name inside the file must exactly match the file name.

### 3. Check for Existing Problems (No Duplicates)
Before adding any new problem solution (whether manually or via Neetcode sync), you **MUST** perform a name-wise check across the repository.
- Search for the problem name and any alternative/equivalent names (e.g. `ContainsDuplicate` vs `DuplicateInteger`, `TwoSum` vs `TwoIntegerSum`).
- If a file for the problem already exists, **DO NOT** create a duplicate file under a different name. You may only update the existing file if explicitly instructed by the user.

### 4. Modifying Existing Code (Strictly Prohibited)
**DO NOT** change the logic of existing code. You are not allowed to refactor or rewrite the core algorithms unless explicitly requested by the user. Only one code implementation is allowed per problem.

### 5. Testcases
When adding new code or reviewing existing code, you must add an example input and output as a testcase at the very end of the file.
Use the following format as a multi-line comment:

```java
/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
```
Only add one or two simple testcases to demonstrate the function's usage.

---

## Neetcode Synchronization Workflow ("do neetcode")

When the user gives the explicit instruction **"do neetcode"**, the AI agent must initiate the synchronization process from the user's `neetcode-submissions` GitHub repository. **Do not execute this workflow unless explicitly asked.**

### Sync Protocol
1. **GitHub MCP Access**: Utilize your configured GitHub MCP tools to directly access the user's `neetcode-submissions` repository. You do not need to `git clone` locally.
2. **Efficient Comparison**: 
   - Retrieve the file/directory tree from `neetcode-submissions`.
   - Retrieve the file/directory tree of this `java_dsa` local repository.
   - Perform an automated, efficient filename comparison between the remote submissions and local files to find missing problems. Trust the filenames for matching.
3. **Filter**:
   - For any missing problem, fetch ONLY the **latest submission** from the GitHub repository.
   - **One Code Per Problem**: Skip any problem that already exists in the local `java_dsa` database.
4. **Integration**:
   - Map the new problem to the correct `DS/Concept` category based on the structure defined above.
   - Save the code into the local repository.
   - Ensure the file and class are renamed to `PascalCase.java`.
   - Append the standard `Testcase` comment block to the end of the new file.

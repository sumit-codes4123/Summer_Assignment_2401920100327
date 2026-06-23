class Solution {
public:
 void inorder(TreeNode* node, vector<int>& result) {
        if (!node) return;
        inorder(node->left, result);       // Traverse left
        result.push_back(node->val);        // Visit root
        inorder(node->right, result);      // Traverse right
    }
    vector<int> inorderTraversal(TreeNode* root) {
       vector<int> result;
        inorder(root, result);
        return result; 
    }
};
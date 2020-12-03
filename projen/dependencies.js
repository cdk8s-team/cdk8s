"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.MonoRepoDependenciesUpgrade = void 0;
const pj = require("projen");
class MonoRepoDependenciesUpgrade extends pj.github.GithubWorkflow {
    constructor(github, name, props) {
        var _a;
        super(github, name);
        this.steps = [];
        this._props = props;
        this.on({ schedule: [{ cron: (_a = props.schedule) !== null && _a !== void 0 ? _a : '0 8 * * *' }] });
        this.steps.push({
            name: 'Checkout',
            uses: 'actions/checkout@v2',
        });
        this.steps.push({
            name: 'Setup Node',
            uses: 'actions/setup-node@v1',
            with: {
                'node-version': '10.17.0',
            },
        });
        this.steps.push({
            name: 'Upgrade lock file',
            run: 'yarn upgrade'
        });
    }
    addPackage(packagePath, options) {
        var _a, _b;
        this.steps.push({
            name: `Update ${packagePath}/package.json`,
            run: `cd ${packagePath} && npx npm-check-updates -u --reject=${((_a = options.exclude) !== null && _a !== void 0 ? _a : []).join(',')} --target=${(_b = options.target) !== null && _b !== void 0 ? _b : 'minor'}`,
        });
    }
    synthesizeContent(resolver) {
        var _a;
        if ((_a = this._props.autoApprove) !== null && _a !== void 0 ? _a : true) {
            // we do this here because this garauntees this step is last.
            this.steps.push({
                name: 'Create Pull Request',
                uses: 'peter-evans/create-pull-request@v3',
                with: {
                    "token": "${{ secrets.GITHUB_TOKEN }}",
                    "commit-message": "Upgrade yarn.lock",
                    "branch": "github-actions/dependencies",
                    "title": "chore(deps): Upgrade dependencies",
                    "body": [
                        "This PR upgrades yarn dependencies to the latest versions.",
                        "",
                        "------",
                        "",
                        "*Automatically created via GitHubActions*"
                    ].join('\n')
                }
            });
        }
        this.addJobs({
            'upgrade': {
                'runs-on': 'ubuntu-latest',
                'steps': this.steps,
            }
        });
        return super.synthesizeContent(resolver);
    }
}
exports.MonoRepoDependenciesUpgrade = MonoRepoDependenciesUpgrade;
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiZGVwZW5kZW5jaWVzLmpzIiwic291cmNlUm9vdCI6IiIsInNvdXJjZXMiOlsiZGVwZW5kZW5jaWVzLnRzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiI7OztBQUNBLDZCQUE2QjtBQTZCN0IsTUFBYSwyQkFBNEIsU0FBUSxFQUFFLENBQUMsTUFBTSxDQUFDLGNBQWM7SUFNdkUsWUFBWSxNQUF3QixFQUFFLElBQVksRUFBRSxLQUE0Qzs7UUFDOUYsS0FBSyxDQUFDLE1BQU0sRUFBRSxJQUFJLENBQUMsQ0FBQztRQUxMLFVBQUssR0FBVyxFQUFFLENBQUM7UUFPbEMsSUFBSSxDQUFDLE1BQU0sR0FBRyxLQUFLLENBQUM7UUFFcEIsSUFBSSxDQUFDLEVBQUUsQ0FBQyxFQUFFLFFBQVEsRUFBRSxDQUFDLEVBQUUsSUFBSSxRQUFFLEtBQUssQ0FBQyxRQUFRLG1DQUFJLFdBQVcsRUFBRSxDQUFDLEVBQUMsQ0FBQyxDQUFBO1FBRS9ELElBQUksQ0FBQyxLQUFLLENBQUMsSUFBSSxDQUFDO1lBQ2QsSUFBSSxFQUFFLFVBQVU7WUFDaEIsSUFBSSxFQUFFLHFCQUFxQjtTQUM1QixDQUFDLENBQUM7UUFFSCxJQUFJLENBQUMsS0FBSyxDQUFDLElBQUksQ0FBQztZQUNkLElBQUksRUFBRSxZQUFZO1lBQ2xCLElBQUksRUFBRSx1QkFBdUI7WUFDN0IsSUFBSSxFQUFFO2dCQUNKLGNBQWMsRUFBRSxTQUFTO2FBQzFCO1NBQ0YsQ0FBQyxDQUFDO1FBRUgsSUFBSSxDQUFDLEtBQUssQ0FBQyxJQUFJLENBQUM7WUFDZCxJQUFJLEVBQUUsbUJBQW1CO1lBQ3pCLEdBQUcsRUFBRSxjQUFjO1NBQ3BCLENBQUMsQ0FBQztJQUVMLENBQUM7SUFHTSxVQUFVLENBQUMsV0FBbUIsRUFBRSxPQUEwQjs7UUFDL0QsSUFBSSxDQUFDLEtBQUssQ0FBQyxJQUFJLENBQUM7WUFDZCxJQUFJLEVBQUUsVUFBVSxXQUFXLGVBQWU7WUFDMUMsR0FBRyxFQUFFLE1BQU0sV0FBVyx5Q0FBeUMsT0FBQyxPQUFPLENBQUMsT0FBTyxtQ0FBSSxFQUFFLENBQUMsQ0FBQyxJQUFJLENBQUMsR0FBRyxDQUFDLGFBQWEsTUFBQSxPQUFPLENBQUMsTUFBTSxtQ0FBSSxPQUFPLEVBQUU7U0FDekksQ0FBQyxDQUFBO0lBQ0osQ0FBQztJQUVTLGlCQUFpQixDQUFDLFFBQXNCOztRQUVoRCxVQUFJLElBQUksQ0FBQyxNQUFNLENBQUMsV0FBVyxtQ0FBSSxJQUFJLEVBQUU7WUFDbkMsNkRBQTZEO1lBQzdELElBQUksQ0FBQyxLQUFLLENBQUMsSUFBSSxDQUFDO2dCQUNkLElBQUksRUFBRSxxQkFBcUI7Z0JBQzNCLElBQUksRUFBRSxvQ0FBb0M7Z0JBQzFDLElBQUksRUFBRTtvQkFDSixPQUFPLEVBQUUsNkJBQTZCO29CQUN0QyxnQkFBZ0IsRUFBRSxtQkFBbUI7b0JBQ3JDLFFBQVEsRUFBRSw2QkFBNkI7b0JBQ3ZDLE9BQU8sRUFBRSxtQ0FBbUM7b0JBQzVDLE1BQU0sRUFBRTt3QkFDTiw0REFBNEQ7d0JBQzVELEVBQUU7d0JBQ0YsUUFBUTt3QkFDUixFQUFFO3dCQUNGLDJDQUEyQztxQkFDNUMsQ0FBQyxJQUFJLENBQUMsSUFBSSxDQUFDO2lCQUNiO2FBQ0YsQ0FBQyxDQUFBO1NBQ0g7UUFFRCxJQUFJLENBQUMsT0FBTyxDQUFDO1lBQ1gsU0FBUyxFQUFFO2dCQUNULFNBQVMsRUFBRSxlQUFlO2dCQUMxQixPQUFPLEVBQUUsSUFBSSxDQUFDLEtBQUs7YUFDcEI7U0FDRixDQUFDLENBQUM7UUFFSCxPQUFPLEtBQUssQ0FBQyxpQkFBaUIsQ0FBQyxRQUFRLENBQUMsQ0FBQztJQUMzQyxDQUFDO0NBRUY7QUExRUQsa0VBMEVDIiwic291cmNlc0NvbnRlbnQiOlsiXG5pbXBvcnQgKiBhcyBwaiBmcm9tICdwcm9qZW4nO1xuXG5leHBvcnQgaW50ZXJmYWNlIEFkZFBhY2thZ2VPcHRpb25zIHtcblxuICByZWFkb25seSB0YXJnZXQ/OiBzdHJpbmc7XG5cbiAgcmVhZG9ubHkgZXhjbHVkZT86IHN0cmluZ1tdO1xuXG59XG5cbmV4cG9ydCBpbnRlcmZhY2UgTW9ub1JlcG9EZXBlbmRlbmNpZXNQcm9wc1VwZ3JhZGVQcm9wcyB7XG5cbiAgcmVhZG9ubHkgc2NoZWR1bGU/OiBzdHJpbmc7XG5cbiAgcmVhZG9ubHkgYXV0b0FwcHJvdmU/OiBib29sZWFuO1xufVxuXG5leHBvcnQgaW50ZXJmYWNlIFN0ZXAge1xuXG4gIHJlYWRvbmx5IHVzZXM/OiBzdHJpbmc7XG5cbiAgcmVhZG9ubHkgcnVuPzogc3RyaW5nO1xuXG4gIHJlYWRvbmx5IG5hbWU/OiBzdHJpbmc7XG5cbiAgcmVhZG9ubHkgd2l0aD86IFJlY29yZDxzdHJpbmcsIHN0cmluZz5cblxufVxuXG5leHBvcnQgY2xhc3MgTW9ub1JlcG9EZXBlbmRlbmNpZXNVcGdyYWRlIGV4dGVuZHMgcGouZ2l0aHViLkdpdGh1YldvcmtmbG93IHtcblxuICBwcml2YXRlIHJlYWRvbmx5IHN0ZXBzOiBTdGVwW10gPSBbXTtcblxuICBwcml2YXRlIHJlYWRvbmx5IF9wcm9wczogTW9ub1JlcG9EZXBlbmRlbmNpZXNQcm9wc1VwZ3JhZGVQcm9wcztcblxuICBjb25zdHJ1Y3RvcihnaXRodWI6IHBqLmdpdGh1Yi5HaXRIdWIsIG5hbWU6IHN0cmluZywgcHJvcHM6IE1vbm9SZXBvRGVwZW5kZW5jaWVzUHJvcHNVcGdyYWRlUHJvcHMpIHtcbiAgICBzdXBlcihnaXRodWIsIG5hbWUpO1xuXG4gICAgdGhpcy5fcHJvcHMgPSBwcm9wcztcblxuICAgIHRoaXMub24oeyBzY2hlZHVsZTogW3sgY3JvbjogcHJvcHMuc2NoZWR1bGUgPz8gJzAgOCAqICogKicgfV19KVxuXG4gICAgdGhpcy5zdGVwcy5wdXNoKHtcbiAgICAgIG5hbWU6ICdDaGVja291dCcsXG4gICAgICB1c2VzOiAnYWN0aW9ucy9jaGVja291dEB2MicsXG4gICAgfSk7XG5cbiAgICB0aGlzLnN0ZXBzLnB1c2goe1xuICAgICAgbmFtZTogJ1NldHVwIE5vZGUnLFxuICAgICAgdXNlczogJ2FjdGlvbnMvc2V0dXAtbm9kZUB2MScsXG4gICAgICB3aXRoOiB7XG4gICAgICAgICdub2RlLXZlcnNpb24nOiAnMTAuMTcuMCcsXG4gICAgICB9LFxuICAgIH0pO1xuXG4gICAgdGhpcy5zdGVwcy5wdXNoKHtcbiAgICAgIG5hbWU6ICdVcGdyYWRlIGxvY2sgZmlsZScsXG4gICAgICBydW46ICd5YXJuIHVwZ3JhZGUnXG4gICAgfSk7XG5cbiAgfVxuXG5cbiAgcHVibGljIGFkZFBhY2thZ2UocGFja2FnZVBhdGg6IHN0cmluZywgb3B0aW9uczogQWRkUGFja2FnZU9wdGlvbnMpIHtcbiAgICB0aGlzLnN0ZXBzLnB1c2goe1xuICAgICAgbmFtZTogYFVwZGF0ZSAke3BhY2thZ2VQYXRofS9wYWNrYWdlLmpzb25gLFxuICAgICAgcnVuOiBgY2QgJHtwYWNrYWdlUGF0aH0gJiYgbnB4IG5wbS1jaGVjay11cGRhdGVzIC11IC0tcmVqZWN0PSR7KG9wdGlvbnMuZXhjbHVkZSA/PyBbXSkuam9pbignLCcpfSAtLXRhcmdldD0ke29wdGlvbnMudGFyZ2V0ID8/ICdtaW5vcid9YCxcbiAgICB9KVxuICB9XG5cbiAgcHJvdGVjdGVkIHN5bnRoZXNpemVDb250ZW50KHJlc29sdmVyOiBwai5JUmVzb2x2ZXIpIHtcblxuICAgIGlmICh0aGlzLl9wcm9wcy5hdXRvQXBwcm92ZSA/PyB0cnVlKSB7XG4gICAgICAvLyB3ZSBkbyB0aGlzIGhlcmUgYmVjYXVzZSB0aGlzIGdhcmF1bnRlZXMgdGhpcyBzdGVwIGlzIGxhc3QuXG4gICAgICB0aGlzLnN0ZXBzLnB1c2goe1xuICAgICAgICBuYW1lOiAnQ3JlYXRlIFB1bGwgUmVxdWVzdCcsXG4gICAgICAgIHVzZXM6ICdwZXRlci1ldmFucy9jcmVhdGUtcHVsbC1yZXF1ZXN0QHYzJyxcbiAgICAgICAgd2l0aDoge1xuICAgICAgICAgIFwidG9rZW5cIjogXCIke3sgc2VjcmV0cy5HSVRIVUJfVE9LRU4gfX1cIixcbiAgICAgICAgICBcImNvbW1pdC1tZXNzYWdlXCI6IFwiVXBncmFkZSB5YXJuLmxvY2tcIixcbiAgICAgICAgICBcImJyYW5jaFwiOiBcImdpdGh1Yi1hY3Rpb25zL2RlcGVuZGVuY2llc1wiLFxuICAgICAgICAgIFwidGl0bGVcIjogXCJjaG9yZShkZXBzKTogVXBncmFkZSBkZXBlbmRlbmNpZXNcIixcbiAgICAgICAgICBcImJvZHlcIjogW1xuICAgICAgICAgICAgXCJUaGlzIFBSIHVwZ3JhZGVzIHlhcm4gZGVwZW5kZW5jaWVzIHRvIHRoZSBsYXRlc3QgdmVyc2lvbnMuXCIsXG4gICAgICAgICAgICBcIlwiLFxuICAgICAgICAgICAgXCItLS0tLS1cIixcbiAgICAgICAgICAgIFwiXCIsXG4gICAgICAgICAgICBcIipBdXRvbWF0aWNhbGx5IGNyZWF0ZWQgdmlhIEdpdEh1YkFjdGlvbnMqXCJcbiAgICAgICAgICBdLmpvaW4oJ1xcbicpXG4gICAgICAgIH1cbiAgICAgIH0pXG4gICAgfVxuXG4gICAgdGhpcy5hZGRKb2JzKHtcbiAgICAgICd1cGdyYWRlJzoge1xuICAgICAgICAncnVucy1vbic6ICd1YnVudHUtbGF0ZXN0JyxcbiAgICAgICAgJ3N0ZXBzJzogdGhpcy5zdGVwcyxcbiAgICAgIH1cbiAgICB9KTtcblxuICAgIHJldHVybiBzdXBlci5zeW50aGVzaXplQ29udGVudChyZXNvbHZlcik7XG4gIH1cblxufVxuXG4iXX0=
"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.YarnMonoRepoProject = void 0;
const pj = require("projen");
const dependencies_1 = require("./dependencies");
class YarnMonoRepoProject extends pj.Project {
    constructor(options) {
        super(options);
        new pj.JsonFile(this, 'package.json', {
            marker: true,
            readonly: false,
            obj: {
                name: 'root',
                version: '0.0.0',
                private: true,
                workspaces: options.workspaces,
                devDependencies: options.devDependencies,
            },
        });
        if (options.dependenciesUpgrade) {
            this.dependenciesUpgrade = new dependencies_1.MonoRepoDependenciesUpgrade(this.github, 'dependencies', {
                schedule: options.dependenciesUpgrade.schedule
            });
        }
    }
}
exports.YarnMonoRepoProject = YarnMonoRepoProject;
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoieWFybi1tb25vLXJlcG8uanMiLCJzb3VyY2VSb290IjoiIiwic291cmNlcyI6WyJ5YXJuLW1vbm8tcmVwby50cyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiOzs7QUFBQSw2QkFBNkI7QUFDN0IsaURBQTZEO0FBMEI3RCxNQUFhLG1CQUFvQixTQUFRLEVBQUUsQ0FBQyxPQUFPO0lBSWpELFlBQVksT0FBbUM7UUFDN0MsS0FBSyxDQUFDLE9BQU8sQ0FBQyxDQUFDO1FBRWYsSUFBSSxFQUFFLENBQUMsUUFBUSxDQUFDLElBQUksRUFBRSxjQUFjLEVBQUU7WUFDcEMsTUFBTSxFQUFFLElBQUk7WUFDWixRQUFRLEVBQUUsS0FBSztZQUNmLEdBQUcsRUFBRTtnQkFDSCxJQUFJLEVBQUUsTUFBTTtnQkFDWixPQUFPLEVBQUUsT0FBTztnQkFDaEIsT0FBTyxFQUFFLElBQUk7Z0JBQ2IsVUFBVSxFQUFFLE9BQU8sQ0FBQyxVQUFVO2dCQUM5QixlQUFlLEVBQUUsT0FBTyxDQUFDLGVBQWU7YUFFekM7U0FDRixDQUFDLENBQUM7UUFFSCxJQUFJLE9BQU8sQ0FBQyxtQkFBbUIsRUFBRTtZQUUvQixJQUFJLENBQUMsbUJBQW1CLEdBQUcsSUFBSSwwQ0FBMkIsQ0FBQyxJQUFJLENBQUMsTUFBTyxFQUFFLGNBQWMsRUFBRTtnQkFDdkYsUUFBUSxFQUFFLE9BQU8sQ0FBQyxtQkFBbUIsQ0FBQyxRQUFRO2FBQy9DLENBQUMsQ0FBQTtTQUVIO0lBRUgsQ0FBQztDQUVGO0FBOUJELGtEQThCQyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCAqIGFzIHBqIGZyb20gJ3Byb2plbic7XG5pbXBvcnQgeyBNb25vUmVwb0RlcGVuZGVuY2llc1VwZ3JhZGUgfSBmcm9tICcuL2RlcGVuZGVuY2llcyc7XG5cbmV4cG9ydCBpbnRlcmZhY2UgWWFybk1vbm9SZXBvUHJvamVjdE9wdGlvbnMgZXh0ZW5kcyBwai5Qcm9qZWN0T3B0aW9ucyB7XG5cbiAgcmVhZG9ubHkgZGVwZW5kZW5jaWVzVXBncmFkZT86IERlcGVuZGVuY2llc1VwZ3JhZGU7XG5cbiAgcmVhZG9ubHkgd29ya3NwYWNlczogV29ya3NwYWNlcztcblxuICByZWFkb25seSBkZXZEZXBlbmRlbmNpZXM6IFJlY29yZDxzdHJpbmcsIHN0cmluZz47XG5cbn1cblxuZXhwb3J0IGludGVyZmFjZSBEZXBlbmRlbmNpZXNVcGdyYWRlIHtcblxuICByZWFkb25seSBzY2hlZHVsZTogc3RyaW5nO1xuXG4gIHJlYWRvbmx5IGF1dG9BcHByb3ZlOiBib29sZWFuO1xufVxuXG5leHBvcnQgaW50ZXJmYWNlIFdvcmtzcGFjZXMge1xuXG4gIHJlYWRvbmx5IHBhY2thZ2VzOiBzdHJpbmdbXTtcblxuICByZWFkb25seSBub0hvaXN0OiBzdHJpbmdbXTtcbn1cblxuZXhwb3J0IGNsYXNzIFlhcm5Nb25vUmVwb1Byb2plY3QgZXh0ZW5kcyBwai5Qcm9qZWN0IHtcblxuICBwdWJsaWMgcmVhZG9ubHkgZGVwZW5kZW5jaWVzVXBncmFkZT86IE1vbm9SZXBvRGVwZW5kZW5jaWVzVXBncmFkZTtcblxuICBjb25zdHJ1Y3RvcihvcHRpb25zOiBZYXJuTW9ub1JlcG9Qcm9qZWN0T3B0aW9ucykge1xuICAgIHN1cGVyKG9wdGlvbnMpO1xuXG4gICAgbmV3IHBqLkpzb25GaWxlKHRoaXMsICdwYWNrYWdlLmpzb24nLCB7XG4gICAgICBtYXJrZXI6IHRydWUsXG4gICAgICByZWFkb25seTogZmFsc2UsXG4gICAgICBvYmo6IHtcbiAgICAgICAgbmFtZTogJ3Jvb3QnLFxuICAgICAgICB2ZXJzaW9uOiAnMC4wLjAnLFxuICAgICAgICBwcml2YXRlOiB0cnVlLFxuICAgICAgICB3b3Jrc3BhY2VzOiBvcHRpb25zLndvcmtzcGFjZXMsXG4gICAgICAgIGRldkRlcGVuZGVuY2llczogb3B0aW9ucy5kZXZEZXBlbmRlbmNpZXMsXG5cbiAgICAgIH0sXG4gICAgfSk7XG5cbiAgICBpZiAob3B0aW9ucy5kZXBlbmRlbmNpZXNVcGdyYWRlKSB7XG5cbiAgICAgIHRoaXMuZGVwZW5kZW5jaWVzVXBncmFkZSA9IG5ldyBNb25vUmVwb0RlcGVuZGVuY2llc1VwZ3JhZGUodGhpcy5naXRodWIhLCAnZGVwZW5kZW5jaWVzJywge1xuICAgICAgICBzY2hlZHVsZTogb3B0aW9ucy5kZXBlbmRlbmNpZXNVcGdyYWRlLnNjaGVkdWxlXG4gICAgICB9KVxuXG4gICAgfVxuXG4gIH1cblxufSJdfQ==
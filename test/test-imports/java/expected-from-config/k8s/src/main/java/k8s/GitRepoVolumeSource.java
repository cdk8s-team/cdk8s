package k8s;

/**
 * Represents a volume that is populated with the contents of a git repository.
 * <p>
 * Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 * <p>
 * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.232Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.GitRepoVolumeSource")
@software.amazon.jsii.Jsii.Proxy(GitRepoVolumeSource.Jsii$Proxy.class)
public interface GitRepoVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Repository URL.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRepository();

    /**
     * Target directory name.
     * <p>
     * Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDirectory() {
        return null;
    }

    /**
     * Commit hash for the specified revision.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRevision() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GitRepoVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GitRepoVolumeSource}
     */
    public static final class Builder {
        private java.lang.String repository;
        private java.lang.String directory;
        private java.lang.String revision;

        /**
         * Sets the value of {@link GitRepoVolumeSource#getRepository}
         * @param repository Repository URL. This parameter is required.
         * @return {@code this}
         */
        public Builder repository(java.lang.String repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Sets the value of {@link GitRepoVolumeSource#getDirectory}
         * @param directory Target directory name.
         *                  Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
         * @return {@code this}
         */
        public Builder directory(java.lang.String directory) {
            this.directory = directory;
            return this;
        }

        /**
         * Sets the value of {@link GitRepoVolumeSource#getRevision}
         * @param revision Commit hash for the specified revision.
         * @return {@code this}
         */
        public Builder revision(java.lang.String revision) {
            this.revision = revision;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GitRepoVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public GitRepoVolumeSource build() {
            return new Jsii$Proxy(repository, directory, revision);
        }
    }

    /**
     * An implementation for {@link GitRepoVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GitRepoVolumeSource {
        private final java.lang.String repository;
        private final java.lang.String directory;
        private final java.lang.String revision;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.repository = this.jsiiGet("repository", java.lang.String.class);
            this.directory = this.jsiiGet("directory", java.lang.String.class);
            this.revision = this.jsiiGet("revision", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String repository, final java.lang.String directory, final java.lang.String revision) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.repository = java.util.Objects.requireNonNull(repository, "repository is required");
            this.directory = directory;
            this.revision = revision;
        }

        @Override
        public java.lang.String getRepository() {
            return this.repository;
        }

        @Override
        public java.lang.String getDirectory() {
            return this.directory;
        }

        @Override
        public java.lang.String getRevision() {
            return this.revision;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("repository", om.valueToTree(this.getRepository()));
            if (this.getDirectory() != null) {
                data.set("directory", om.valueToTree(this.getDirectory()));
            }
            if (this.getRevision() != null) {
                data.set("revision", om.valueToTree(this.getRevision()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GitRepoVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GitRepoVolumeSource.Jsii$Proxy that = (GitRepoVolumeSource.Jsii$Proxy) o;

            if (!repository.equals(that.repository)) return false;
            if (this.directory != null ? !this.directory.equals(that.directory) : that.directory != null) return false;
            return this.revision != null ? this.revision.equals(that.revision) : that.revision == null;
        }

        @Override
        public int hashCode() {
            int result = this.repository.hashCode();
            result = 31 * result + (this.directory != null ? this.directory.hashCode() : 0);
            result = 31 * result + (this.revision != null ? this.revision.hashCode() : 0);
            return result;
        }
    }
}
